//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean primaDataPrecedeData2 = data1.isBefore(data2);
        boolean secondaDataSuccesivaData1= data2.isAfter(data1);
        boolean data1UgualeData2= data1.isEqual(data2);


        System.out.println("PrimaData Dopo Data2 :" + primaDataPrecedeData2);
        System.out.println("SecondaData è succesiva Data1 :" + secondaDataSuccesivaData1);
        System.out.println(" Data1 è uguale a Data2 :" + data1UgualeData2);

    }
}