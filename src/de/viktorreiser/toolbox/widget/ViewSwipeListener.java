/**
 * 
 */
package de.viktorreiser.toolbox.widget;

import android.widget.ListView;
import de.viktorreiser.toolbox.widget.SwipeableListItem.SwipeEvent;

/**
 * @author abentan.codigodelsur
 *
 */
public interface ViewSwipeListener
{
    
    /**
     * From SwipeableListItem.
     * List view callback with events which helps to perform swipe action on view item.
     * 
     * @param listView
     *            list view which contains this view
     * @param event
     *            swipe event
     * @param offset
     *            offset in pixel of current swipe (so {@code 0} on {@link SwipeEvent#START})
     * @param position
     *            position of view in list
     * 
     * @return first return of {@code true} indicates that view started to perform swipe action -
     *         usually swipe is started after a certain offset movement (e.g.
     *         {@code Math.abs(offset) > 50}, this enables the list to perform click and long click
     *         actions - return of {@code true} on {@link SwipeEvent#START} will begin the swipe
     *         action immediately and consume any clicks and long clicks instantly
     * @see SwipeableListItem
     */
    public boolean onViewSwipe(ListView listView, SwipeEvent event, int offset, int position,
            SwipeableListItem restoreItem);
}
