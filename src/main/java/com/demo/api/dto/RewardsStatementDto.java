package com.demo.api.dto;

import jakarta.validation.constraints.NotEmpty;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto class for RewardsDto
 *
 * @author Ahsan
 * @since Mar 25, 2023
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RewardsStatementDto {
    /** Variable declaration for id */
    @NotEmpty private Long customerId;

    /** Variable declaration for customerName */
    @NotEmpty private String customerName;

    /** Variable declaration for total */
    private Double totalPurchase = Double.valueOf(0.0);

    /** Variable declaration for pointsEarned */
    private Long totalPoints = Long.valueOf(0);

    /** Variable declaration for createDate */
    private Map<String, Long> pointsByMonth = new HashMap<>();
}
