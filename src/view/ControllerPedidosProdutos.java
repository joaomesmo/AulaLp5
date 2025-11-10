/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.PedidosProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerPedidosProdutos extends AbstractTableModel {

    private List lstPedProd;

    public void setList(List lstPedidosProdutos) {
        this.lstPedProd = lstPedidosProdutos;
    }
    
    public PedidosProdutos getBean(int rowIndex) {
        return (PedidosProdutos) lstPedProd.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstPedProd.size();
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PedidosProdutos pedprod = (PedidosProdutos) lstPedProd.get( rowIndex);
        if ( columnIndex == 0 ){
            return pedprod.getProdutos().getIdprodutos();
        } else if (columnIndex ==1) {
            return pedprod.getProdutos().getNome();        
        } else if (columnIndex ==2) {
            return pedprod.getQuantidade();
        } else if (columnIndex ==3) {
            return pedprod.getValorUnitario();
        } else if (columnIndex ==4) {
            return pedprod.getQuantidade() * pedprod.getValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "quantidade";
        } else if ( columnIndex == 3) {
            return "valor unitario";
        }else if ( columnIndex == 4) {
            return "total";
        }
        
        return "";
    }
    
}
