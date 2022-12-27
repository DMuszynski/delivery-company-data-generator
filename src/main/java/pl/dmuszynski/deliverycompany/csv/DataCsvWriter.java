package pl.dmuszynski.deliverycompany.csv;

import pl.dmuszynski.deliverycompany.csv.datamapper.ObjectCsvFormatMapper;
import pl.dmuszynski.deliverycompany.data.AbstractEntity;
import pl.dmuszynski.deliverycompany.mapper.DataDTOMapper;
import pl.dmuszynski.deliverycompany.payload.AbstractEntityDTO;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public final class DataCsvWriter<D extends AbstractEntity, DTO extends AbstractEntityDTO> {

    public void writeDataToCsv(Set<D> entityList, DataDTOMapper<D, DTO> dataDTOMapper, String filename, Class<DTO> type) {
        // Map entity list to sorted by id DTO entity list
        List<DTO> entityDTOList = entityList
                .stream()
                .map(dataDTOMapper::mapToDTO)
                .sorted(Comparator.comparing(AbstractEntityDTO::getId))
                .toList();

        // Format entities to string list and write to CSV file
        final ObjectCsvFormatMapper<DTO> csvFormatMapper = new ObjectCsvFormatMapper<>();
        final List<String[]> dataString = csvFormatMapper.createCsvData(entityDTOList, type);
        OpenCsvWriter.writeDataToDefaultFolder(dataString, filename);
    }
}
