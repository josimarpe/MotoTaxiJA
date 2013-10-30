
package br.edu.novaroma.persistence;

import br.edu.novaroma.model.MotoTaxista;
import java.util.ArrayList;
import java.util.List;

public class MotoTaxiDAO {
    private static List<MotoTaxista> motoTaxista = new ArrayList<MotoTaxista>();
//METODOS PARA CADASTRAR E LISTAR MOTOTAXISTAS:
    public static void CadastrarMotoTaxista(MotoTaxista mototaxista){
        motoTaxista.add(mototaxista);
    }
    public static List<MotoTaxista> listarMotoTaxistas(){
        return motoTaxista;
        
    }

}
