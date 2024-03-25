package edu.mit.annotation.realdto;

import lombok.*;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewPurchOrderItem {
    private Integer purch_order_quantity;
    private String note;
    private String proc_plan_number;
    private String purch_order_number;
    private Date receive_duedate;
}
