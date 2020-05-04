package Hqs.example.HQs.Model;


import lombok.*;

/**
 * @author Braiu
 * @since 03/05/2020
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Inf {
    @Getter @Setter
    private String HQ;
    @Getter @Setter
    private String type;
    @Getter @Setter
    private String publishing_Company;


}
