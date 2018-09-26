package com.fallendeductionist.evaluacion2;
import java.util.ArrayList;

public class ResultRepository {

    private static ArrayList<ExampleResult> mExampleList;

    static {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleResult(R.drawable.picture1, "Restaurant Sol de Oro", "Cascanueces N° 221", "994 434 567", "Restaurantes"));
        mExampleList.add(new ExampleResult(R.drawable.picture2, "Restaurant Kudrov", "Sol de Villa N° 45", "234 545 789", "Restaurantes"));
        mExampleList.add(new ExampleResult(R.drawable.picture3, "Restaurant Brown", "Arenales N° 3478", "567 345 232", "Restaurantes"));
        mExampleList.add(new ExampleResult(R.drawable.picture4, "Restaurant Auditore", "Lima N° 324", "678 234 210", "Restaurantes"));
        mExampleList.add(new ExampleResult(R.drawable.picture5, "Restaurant Piers", "Cruzado N° 67", "567 745 975", "Restaurantes"));
        mExampleList.add(new ExampleResult(R.drawable.picture1, "Museo Prehistorico", "Brazil N° 978", "994 734 356", "Museos"));
        mExampleList.add(new ExampleResult(R.drawable.picture2, "Museo Antropologico", "San Martín N° 90", "432 832 328", "Museos"));
        mExampleList.add(new ExampleResult(R.drawable.picture3, "Instituto Tecsup", "Cascanueces N° 2221", "567 345 232", "Institutos"));
        mExampleList.add(new ExampleResult(R.drawable.picture4, "Instituto Cibertec", "Breña N° 912", "994 234 233", "Institutos"));
        mExampleList.add(new ExampleResult(R.drawable.picture5, "Instituto Senati", "Por Algun Lado N° 543", "088 098 325", "Institutos"));
        mExampleList.add(new ExampleResult(R.drawable.picture1, "Parque Simon Bolivar", "Bolivar N° 456", "998 532 821", "Parques"));
        mExampleList.add(new ExampleResult(R.drawable.picture2, "Parque Jose Olaya", "Olaya N° 4358", "731 921 954", "Parques"));
        mExampleList.add(new ExampleResult(R.drawable.picture3, "Parque Tupac Amaru", "Tupac N° 763", "013 193 832", "Parques"));
        mExampleList.add(new ExampleResult(R.drawable.picture4, "Parque José Balta", "Balta N° 1024", "382 812 864", "Parques"));
        mExampleList.add(new ExampleResult(R.drawable.picture5, "Parque Pizarro", "Pizarro N° 312", "835 921 349", "Parques"));
        mExampleList.add(new ExampleResult(R.drawable.picture1, "Hotel Bellavista", "Grau N° 054", "329 065 943", "Hoteles"));
        mExampleList.add(new ExampleResult(R.drawable.picture2, "Hotel Sheraton", "Ni idea N° 405", "654 032 854", "Hoteles"));
        mExampleList.add(new ExampleResult(R.drawable.picture3, "Hotel Presidente", "Vizcarra N° 921", "945 953 392", "Hoteles"));
        mExampleList.add(new ExampleResult(R.drawable.picture4, "Hotel Altair", "Altair N° 4", "123 345 876", "Hoteles"));
        mExampleList.add(new ExampleResult(R.drawable.picture5, "Hotel Luna Creciente", "Noche N° 123", "654 643 983", "Hoteles"));
        mExampleList.add(new ExampleResult(R.drawable.picture1, "Hotel 5 Estrellas", "Estrella N° 34579", "234 765 943", "Hoteles"));
        mExampleList.add(new ExampleResult(R.drawable.picture2, "Hospital Niño jesus", "Dios N° 666", "843 853 921", "Hospitales"));
        mExampleList.add(new ExampleResult(R.drawable.picture3, "Hospital Virgen María", "Maria N° 643", "912 954 653", "Hospitales"));
        mExampleList.add(new ExampleResult(R.drawable.picture4, "Hospital Judas el Traidor", "Judas N° 65321", "954 593 932", "Hospitales"));
        mExampleList.add(new ExampleResult(R.drawable.picture5, "Hospital El otro Judas", "Tadeo N° 8765", "234 965 843", "Hospitales"));
    }
    public static ArrayList<ExampleResult> getPersons(){
        return mExampleList;
    }

}
