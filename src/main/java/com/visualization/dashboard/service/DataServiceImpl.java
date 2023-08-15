package com.visualization.dashboard.service;

import com.visualization.dashboard.entity.Data;
import com.visualization.dashboard.payload.DataDTO;
import com.visualization.dashboard.repository.DataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataServiceImpl implements DataService {

    private final DataRepository dataRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public DataServiceImpl(DataRepository dataRepository, ModelMapper modelMapper) {
        this.dataRepository = dataRepository;
        this.modelMapper = modelMapper;

    }

    @Override
    public List<DataDTO> getDataWithFilters(Integer endYear, List<String> topics,
                                            String sector, String region,
                                            String pest, String source,
                                            String swot, String country,
                                            String city) {
        List<Data> filteredData = dataRepository.findFilteredData(endYear, topics, sector, region, pest, source, swot, country, city);
        return filteredData.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private DataDTO convertToDTO(Data data) {
        return modelMapper.map(data, DataDTO.class);
    }
}
