package org.eclipse.spykit.runtime.views.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.spykit.runtime.views.ActivePluginsView;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;



/**
 * @author Sandeesh
 */
public class RefreshActivePluginsViewAction implements IViewActionDelegate {

  private ActivePluginsView view;

  @Override
  public void run(final IAction action) {
    this.view.getContentProvider().clearModel();
    this.view.refresh();

  }

  @Override
  public void selectionChanged(final IAction action, final ISelection selection) {
    // TODO Auto-generated method stub

  }

  @Override
  public void init(final IViewPart view) {
    this.view = (ActivePluginsView) view;

  }

}
