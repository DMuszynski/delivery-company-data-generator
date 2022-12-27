package pl.dmuszynski.deliverycompany.csv.datamapper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class ObjectCsvFormatMapper<T> {

    public List<String[]> createCsvData(List<T> mappedObject, Class<T> type) {
        final String[] header = this.getCsvHeader(type);
        final List<String[]> csvDataList = new ArrayList<>();

        csvDataList.add(header);
        mappedObject.forEach(time -> csvDataList.add(getCsvRecord(time)));

        return csvDataList;
    }

    private String[] getCsvHeader(Class<T> type) {
        final Field[] csvHeaderSuperClassFields = type.getSuperclass().getDeclaredFields();
        final Field[] csvHeaderClassFields = type.getDeclaredFields();
        final Field[] csvHeaderFields = Stream.concat(Arrays.stream(csvHeaderSuperClassFields), Arrays.stream(csvHeaderClassFields))
                .toArray(Field[]::new);

        final String[] csvHeaderStringList = new String[csvHeaderFields.length];
        for (int i = 0; i < csvHeaderFields.length; ++i)
            csvHeaderStringList[i] = csvHeaderFields[i].getName();

        return csvHeaderStringList;
    }

    private String[] getCsvRecord(T object) {
        final Field[] objectSuperClassFields = object.getClass().getSuperclass().getDeclaredFields();
        final Field[] objectClassFields = object.getClass().getDeclaredFields();
        final Field[] objectFields = Stream.concat(Arrays.stream(objectSuperClassFields), Arrays.stream(objectClassFields))
                .toArray(Field[]::new);
        Arrays.stream(objectFields).forEach(field -> field.setAccessible(true));

        int attributeCount = objectFields.length;
        final String[] record = new String[attributeCount];
        for (int i = 0; i < attributeCount; i++)
            try {
                record[i] = objectFields[i].get(object).toString();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        return record;
    }
}
