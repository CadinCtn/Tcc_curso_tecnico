/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordem_producao;

import java.lang.ModuleLayer.Controller;

/**
 *
 * @author senai
 */
public class OrdemProducao {
    
    int id;
    String categoria;
    int ee;
    float larguraTecido;
    float metragemTecido;
    float metExtra;
    int lonas;
    String setor;
    String espessura;
    String observacao;
    boolean edit = false;
    
    private static CUOrdemProducaoGUI cuopgui;

    public float getMetExtra() {
        return metExtra;
    }

    public void setMetExtra(float metExtra) {
        this.metExtra = metExtra;
    }

    public String getEspessura() {
        return espessura;
    }

    public void setEspessura(String espessura) {
        this.espessura = espessura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEe() {
        return ee;
    }

    public void setEe(int ee) {
        this.ee = ee;
    }

    public float getLarguraTecido() {
        return larguraTecido;
    }

    public void setLarguraTecido(float larguraTecido) {
        this.larguraTecido = larguraTecido;
    }

    public float getMetragemTecido() {
        return metragemTecido;
    }

    public void setMetragemTecido(float metragemTecido) {
        this.metragemTecido = metragemTecido;
    }

    public int getLonas() {
        return lonas;
    }

    public void setLonas(int lonas) {
        this.lonas = lonas;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean getEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
    
    
    
    
}
