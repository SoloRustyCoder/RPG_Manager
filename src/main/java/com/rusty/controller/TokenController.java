package com.rusty.controller;
import com.rusty.model.Fighter;
import com.rusty.model.Ocultist;
import com.rusty.model.Specialist;
import com.rusty.model.TokenList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TokenController {
    
    //Metodo para registro de fichas, tratando cada uma das classes de maneira diferente
    public boolean registry(int id, String character, String playerName,String classe ,String origin, int str, int dex, int mind, int vig, int pre){
        switch (classe) {
        case "Especialista" ->             {
                Specialist token = new Specialist(id, character, playerName, classe, origin, str, dex, mind, vig, pre);
                return TokenList.getInstance().add(token);
            }
        case "Ocultista" ->             {
                Ocultist token = new Ocultist(id, character, playerName, classe, origin, str, dex, mind, vig, pre);
                return TokenList.getInstance().add(token);
            }
        case "Combatente" ->             {
                Fighter token = new Fighter(id, character, playerName, classe, origin, str, dex, mind, vig, pre);
                return TokenList.getInstance().add(token);
            }
        }
    return false;
    }

    //Metodo usado para preencher e atualizar a tabela da interface Token
    public void fillTable(JTable jTable) {
        
        DefaultTableModel dmt = (DefaultTableModel) jTable.getModel();
        
        dmt.setRowCount(TokenList.getInstance().size());
        jTable.setModel(dmt);
        
        int linePosition = 0;
        
        for(int i = 0; i < TokenList.getInstance().size(); i++){
            jTable.setValueAt(TokenList.getInstance().get(i).getId(), linePosition, 0);
            jTable.setValueAt(TokenList.getInstance().get(i).getCharacter(), linePosition, 1);
            jTable.setValueAt(TokenList.getInstance().get(i).getPlayerName(), linePosition, 2);
            jTable.setValueAt(TokenList.getInstance().get(i).getClasse().toString(), linePosition, 3);
            jTable.setValueAt(TokenList.getInstance().get(i).getOrigin(), linePosition, 4);
            jTable.setValueAt(TokenList.getInstance().get(i).getStrength(), linePosition, 5);
            jTable.setValueAt(TokenList.getInstance().get(i).getDexterity(), linePosition, 6);
            jTable.setValueAt(TokenList.getInstance().get(i).getMind(), linePosition, 7);
            jTable.setValueAt(TokenList.getInstance().get(i).getPresence(), linePosition, 8);
            jTable.setValueAt(TokenList.getInstance().get(i).getVigor(), linePosition, 9);
            jTable.setValueAt(TokenList.getInstance().get(i).getLife(TokenList.getInstance().get(i).getVigor()), linePosition, 10);
            jTable.setValueAt(TokenList.getInstance().get(i).getSanity(), linePosition, 11);
            jTable.setValueAt(TokenList.getInstance().get(i).effortPoints(TokenList.getInstance().get(i).getMind()), linePosition, 12);
            
            linePosition += 1;
        }
    }

    //Metodo usado para deletar um registro selecionado da tabela
    public void delete(JTable jTable) {
        if(jTable.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma ficha na tabela", "Aviso!", 0);
        }
        else{
            int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o contato", "Aviso!", JOptionPane.YES_NO_OPTION);
            
            if(option == JOptionPane.YES_OPTION){
                TokenList.getInstance().remove(jTable.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Contato Excluido com sucesso", "Aviso!", 1);
                
                fillTable(jTable);
            }
        }
    }

    //Metodo de procura a partir de um id, para a modificação de uma ficha
    public List<Object> search(int id) {
        boolean found = false;
        int position = -1;
        
        for(int i = 0; i < TokenList.getInstance().size(); i++){
            if(TokenList.getInstance().get(i).getId() == id){
                found = true;
                position = i;
            }
        }
        
        if(found == true){
            String character = TokenList.getInstance().get(position).getCharacter();
            String player = TokenList.getInstance().get(position).getPlayerName();
            
            return Arrays.asList(id, character, player);
        }
        else{
            JOptionPane.showMessageDialog(null, "Contato não encontrado", "Aviso!", 0);
            return null;
        }
    }

    //Metodo usado para modificar uma ficha de acordo com as informações recebidas
    public void edit(int id, String character, String player, String classe, String origin, int str, int vig, int pre, int dex, int mind) {
        int aswner = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja atualizar essa ficha?", "Aviso!", JOptionPane.YES_NO_OPTION);
        
        if(aswner == JOptionPane.YES_OPTION){
            
            int position = searchToken(id);
            
            switch (classe) {
                case "Especialista" ->             {
                    Specialist token = new Specialist(id, character, player, classe, origin, str, dex, mind, vig, pre);
                    TokenList.getInstance().set(position, token);
                    JOptionPane.showConfirmDialog(null, "Contato atualizado com sucesso", "Aviso!", 1);
                    }
                case "Ocultista" ->             {
                    Ocultist token = new Ocultist(id, character, player, classe, origin, str, dex, mind, vig, pre);
                    TokenList.getInstance().set(position, token);
                    JOptionPane.showConfirmDialog(null, "Contato atualizado com sucesso", "Aviso!", 1);
                }
                case "Combatente" ->             {
                    Fighter token = new Fighter(id, character, player, classe, origin, str, dex, mind, vig, pre);
                    TokenList.getInstance().set(position, token);
                    JOptionPane.showConfirmDialog(null, "Contato atualizado com sucesso", "Aviso!", 1);
                }
            }
        }
    }

    //Metodo de procura de um registro a partir de uma lista
    private int searchToken(int id) {
        int position = -1;
        for(int i = 0; i < TokenList.getInstance().size(); i++){
            if(TokenList.getInstance().get(i).getId() == id){
                position = i;
            }
        }
        return position;
    }
}
