package com.visualization.dashboard.service;


import com.visualization.dashboard.payload.DataDTO;

import java.util.List;

public interface DataService {
    List<DataDTO> getDataWithFilters(Integer endYear, List<String> topics,
                                     String sector, String region,
                                     String pest, String source,
                                     String swot, String country,
                                     String city);

}

