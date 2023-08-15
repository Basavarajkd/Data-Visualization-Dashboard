package com.visualization.dashboard.repository;


import com.visualization.dashboard.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataRepository extends JpaRepository<Data, Long> {
    @Query("SELECT d FROM Data d WHERE " +
            "(:endYear IS NULL OR d.endyear = :endYear) " +
            "AND (:topics IS NULL OR d.topic IN :topics) " +
            "AND (:sector IS NULL OR d.sector = :sector) " +
            "AND (:region IS NULL OR d.region = :region) " +
            "AND (:pest IS NULL OR d.pestle = :pest) " +
            "AND (:source IS NULL OR d.source = :source) " +
            "AND (:swot IS NULL OR d.swot = :swot) " +
            "AND (:country IS NULL OR d.country = :country) " +
            "AND (:city IS NULL OR d.city = :city)")
    List<Data> findFilteredData(Integer endYear, List<String> topics,
                                String sector, String region,
                                String pest, String source,
                                String swot, String country,
                                String city);


}

