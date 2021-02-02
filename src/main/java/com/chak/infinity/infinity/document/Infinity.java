package com.chak.infinity.infinity.document;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;



@Document("infinity")
@Getter
@Builder
public class Infinity {

    @Id
    private String id;
    @Indexed
    private final String uuid;

    private String info;

}
