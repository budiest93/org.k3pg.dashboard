package org.k3pg.dashboard.form;

import java.io.Serializable;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.panel.CustomForm;
import org.adempiere.webui.panel.IFormController;
import org.compiere.apps.form.GenForm;
import org.compiere.minigrid.IMiniTable;
import org.zkoss.zul.Iframe;

public class KPG_UndianAnggota extends GenForm implements IFormController, Serializable{

  private static final long serialVersionUID = 8955136262833574275L;
  CustomForm form = new CustomForm();
  
  public KPG_UndianAnggota() {
    Iframe iframe = new Iframe("../embbed/static/undi");
    iframe.setWidth("100%");
    iframe.setHeight("100%");
    form.appendChild(iframe);
  }
  
  @Override
  public ADForm getForm() {
    // TODO Auto-generated method stub
    return form;
  }

  @Override
  public void configureMiniTable(IMiniTable miniTable) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void saveSelection(IMiniTable miniTable) {
    // TODO Auto-generated method stub
    
  }

}
