package Movie.example.Movie.Model;


import lombok.*;

/**
 * @author Braiu
 * @since 03/05/2020
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Itens {

    @Getter @Setter
    private String Name;

    @Getter @Setter
    private  String Type;

    @Getter @Setter
    private String Classification;

    @Getter @Setter
    private String Awards;
}
