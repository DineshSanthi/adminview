package com.mycompany.client;

/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.types.SelectionStyle;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class NavigatorTreeGrid extends ListGrid {

    public NavigatorTreeGrid(DataSource navigatorDS) {

        setShowHeader(false);
        setLeaveScrollbarGap(false);
        setAnimateFolders(true);
        setCanAcceptDroppedRecords(true);
        //setCanReparentNodes(false);
        setSelectionType(SelectionStyle.SINGLE);
        setDataSource(navigatorDS);
    }
    
}

