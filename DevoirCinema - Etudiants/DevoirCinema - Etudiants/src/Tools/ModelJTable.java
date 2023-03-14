package Tools;

import Entities.Acteur;
import Entities.Cinema;
import Entities.Film;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel {
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    // A compléter ici
    public void LoadDatasCinéma(ArrayList<Cinema> mesCinémas) {

        columns = new String[]{"Numéro", "Nom"};
        rows = new Object[mesCinémas.size()][2];
        int i = 0;

        for (Cinema cin : mesCinémas) {
            rows[i][0] = cin.getIdCinema();
            rows[i][1] = cin.getNomCinema();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadDataFilm(ArrayList<Film> mesFilms) {
        columns = new String[]{"Numéro", "Nom"};
        rows = new Object[mesFilms.size()][2];
        int i = 0;
        for (Film fil : mesFilms) {
            rows[i][0] = fil.getIdFilm();
            rows[i][1] = fil.getNomFilm();
            i++;

        }
        fireTableChanged(null);
    }
    public void LoadDataActeur(ArrayList<Acteur> mesActeurs)
    {
        columns = new String[]{"Numero", "Nom", "Note"};
        rows = new Object[mesActeurs.size()][3];
        int i = 0;

        for (Acteur act : mesActeurs){
            rows[i][0] = act.getIdActeur();
            rows[i][1] = act.getNomActeur();
            rows[i][2] = act.getNoteActeur();
            i++;
        }
        fireTableChanged(null);
    }

}
