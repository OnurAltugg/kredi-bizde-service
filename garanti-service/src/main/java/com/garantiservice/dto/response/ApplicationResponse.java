package com.garantiservice.dto.response;

import lombok.*;

import java.time.LocalDateTime;

import com.garantiservice.enums.ApplicationStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApplicationResponse {

    private Long appId;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private ApplicationStatus applicationStatus;
}
