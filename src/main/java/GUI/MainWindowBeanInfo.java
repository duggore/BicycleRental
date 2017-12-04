/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.*;

/**
 *
 * @author PC
 */
public class MainWindowBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( GUI.MainWindow.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_active = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_alwaysOnTop = 4;
    private static final int PROPERTY_alwaysOnTopSupported = 5;
    private static final int PROPERTY_autoRequestFocus = 6;
    private static final int PROPERTY_background = 7;
    private static final int PROPERTY_backgroundSet = 8;
    private static final int PROPERTY_baselineResizeBehavior = 9;
    private static final int PROPERTY_bicycleTable = 10;
    private static final int PROPERTY_bicycleTableModel = 11;
    private static final int PROPERTY_bounds = 12;
    private static final int PROPERTY_bufferStrategy = 13;
    private static final int PROPERTY_colorModel = 14;
    private static final int PROPERTY_component = 15;
    private static final int PROPERTY_componentCount = 16;
    private static final int PROPERTY_componentListeners = 17;
    private static final int PROPERTY_componentOrientation = 18;
    private static final int PROPERTY_components = 19;
    private static final int PROPERTY_containerListeners = 20;
    private static final int PROPERTY_contentPane = 21;
    private static final int PROPERTY_cursor = 22;
    private static final int PROPERTY_cursorSet = 23;
    private static final int PROPERTY_cursorType = 24;
    private static final int PROPERTY_customerTable = 25;
    private static final int PROPERTY_customerTableModel = 26;
    private static final int PROPERTY_defaultCloseOperation = 27;
    private static final int PROPERTY_displayable = 28;
    private static final int PROPERTY_doubleBuffered = 29;
    private static final int PROPERTY_dropTarget = 30;
    private static final int PROPERTY_enabled = 31;
    private static final int PROPERTY_extendedState = 32;
    private static final int PROPERTY_focusable = 33;
    private static final int PROPERTY_focusableWindow = 34;
    private static final int PROPERTY_focusableWindowState = 35;
    private static final int PROPERTY_focusCycleRoot = 36;
    private static final int PROPERTY_focusCycleRootAncestor = 37;
    private static final int PROPERTY_focused = 38;
    private static final int PROPERTY_focusListeners = 39;
    private static final int PROPERTY_focusOwner = 40;
    private static final int PROPERTY_focusTraversable = 41;
    private static final int PROPERTY_focusTraversalKeys = 42;
    private static final int PROPERTY_focusTraversalKeysEnabled = 43;
    private static final int PROPERTY_focusTraversalPolicy = 44;
    private static final int PROPERTY_focusTraversalPolicyProvider = 45;
    private static final int PROPERTY_focusTraversalPolicySet = 46;
    private static final int PROPERTY_font = 47;
    private static final int PROPERTY_fontSet = 48;
    private static final int PROPERTY_foreground = 49;
    private static final int PROPERTY_foregroundSet = 50;
    private static final int PROPERTY_glassPane = 51;
    private static final int PROPERTY_graphics = 52;
    private static final int PROPERTY_graphicsConfiguration = 53;
    private static final int PROPERTY_height = 54;
    private static final int PROPERTY_hierarchyBoundsListeners = 55;
    private static final int PROPERTY_hierarchyListeners = 56;
    private static final int PROPERTY_iconImage = 57;
    private static final int PROPERTY_iconImages = 58;
    private static final int PROPERTY_ignoreRepaint = 59;
    private static final int PROPERTY_inputContext = 60;
    private static final int PROPERTY_inputMethodListeners = 61;
    private static final int PROPERTY_inputMethodRequests = 62;
    private static final int PROPERTY_insets = 63;
    private static final int PROPERTY_JMenuBar = 64;
    private static final int PROPERTY_keyListeners = 65;
    private static final int PROPERTY_layeredPane = 66;
    private static final int PROPERTY_layout = 67;
    private static final int PROPERTY_lightweight = 68;
    private static final int PROPERTY_locale = 69;
    private static final int PROPERTY_location = 70;
    private static final int PROPERTY_locationByPlatform = 71;
    private static final int PROPERTY_locationOnScreen = 72;
    private static final int PROPERTY_locationRelativeTo = 73;
    private static final int PROPERTY_maximizedBounds = 74;
    private static final int PROPERTY_maximumSize = 75;
    private static final int PROPERTY_maximumSizeSet = 76;
    private static final int PROPERTY_menuBar = 77;
    private static final int PROPERTY_minimumSize = 78;
    private static final int PROPERTY_minimumSizeSet = 79;
    private static final int PROPERTY_modalExclusionType = 80;
    private static final int PROPERTY_mostRecentFocusOwner = 81;
    private static final int PROPERTY_mouseListeners = 82;
    private static final int PROPERTY_mouseMotionListeners = 83;
    private static final int PROPERTY_mousePosition = 84;
    private static final int PROPERTY_mouseWheelListeners = 85;
    private static final int PROPERTY_name = 86;
    private static final int PROPERTY_opacity = 87;
    private static final int PROPERTY_opaque = 88;
    private static final int PROPERTY_ownedWindows = 89;
    private static final int PROPERTY_owner = 90;
    private static final int PROPERTY_parent = 91;
    private static final int PROPERTY_peer = 92;
    private static final int PROPERTY_preferredSize = 93;
    private static final int PROPERTY_preferredSizeSet = 94;
    private static final int PROPERTY_propertyChangeListeners = 95;
    private static final int PROPERTY_rentalTable = 96;
    private static final int PROPERTY_rentalTableModel = 97;
    private static final int PROPERTY_resizable = 98;
    private static final int PROPERTY_rootPane = 99;
    private static final int PROPERTY_shape = 100;
    private static final int PROPERTY_showing = 101;
    private static final int PROPERTY_size = 102;
    private static final int PROPERTY_state = 103;
    private static final int PROPERTY_title = 104;
    private static final int PROPERTY_toolkit = 105;
    private static final int PROPERTY_transferHandler = 106;
    private static final int PROPERTY_treeLock = 107;
    private static final int PROPERTY_type = 108;
    private static final int PROPERTY_undecorated = 109;
    private static final int PROPERTY_valid = 110;
    private static final int PROPERTY_validateRoot = 111;
    private static final int PROPERTY_visible = 112;
    private static final int PROPERTY_warningString = 113;
    private static final int PROPERTY_width = 114;
    private static final int PROPERTY_windowFocusListeners = 115;
    private static final int PROPERTY_windowListeners = 116;
    private static final int PROPERTY_windowStateListeners = 117;
    private static final int PROPERTY_x = 118;
    private static final int PROPERTY_y = 119;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[120];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", GUI.MainWindow.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_active] = new PropertyDescriptor ( "active", GUI.MainWindow.class, "isActive", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", GUI.MainWindow.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", GUI.MainWindow.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_alwaysOnTop] = new PropertyDescriptor ( "alwaysOnTop", GUI.MainWindow.class, "isAlwaysOnTop", "setAlwaysOnTop" ); // NOI18N
            properties[PROPERTY_alwaysOnTopSupported] = new PropertyDescriptor ( "alwaysOnTopSupported", GUI.MainWindow.class, "isAlwaysOnTopSupported", null ); // NOI18N
            properties[PROPERTY_autoRequestFocus] = new PropertyDescriptor ( "autoRequestFocus", GUI.MainWindow.class, "isAutoRequestFocus", "setAutoRequestFocus" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", GUI.MainWindow.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", GUI.MainWindow.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", GUI.MainWindow.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_bicycleTable] = new PropertyDescriptor ( "bicycleTable", GUI.MainWindow.class, "getBicycleTable", null ); // NOI18N
            properties[PROPERTY_bicycleTableModel] = new PropertyDescriptor ( "bicycleTableModel", GUI.MainWindow.class, "getBicycleTableModel", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", GUI.MainWindow.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_bufferStrategy] = new PropertyDescriptor ( "bufferStrategy", GUI.MainWindow.class, "getBufferStrategy", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", GUI.MainWindow.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", GUI.MainWindow.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", GUI.MainWindow.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", GUI.MainWindow.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", GUI.MainWindow.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", GUI.MainWindow.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", GUI.MainWindow.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentPane] = new PropertyDescriptor ( "contentPane", GUI.MainWindow.class, "getContentPane", "setContentPane" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", GUI.MainWindow.class, null, "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", GUI.MainWindow.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_cursorType] = new PropertyDescriptor ( "cursorType", GUI.MainWindow.class, "getCursorType", null ); // NOI18N
            properties[PROPERTY_customerTable] = new PropertyDescriptor ( "customerTable", GUI.MainWindow.class, "getCustomerTable", null ); // NOI18N
            properties[PROPERTY_customerTableModel] = new PropertyDescriptor ( "customerTableModel", GUI.MainWindow.class, "getCustomerTableModel", null ); // NOI18N
            properties[PROPERTY_defaultCloseOperation] = new PropertyDescriptor ( "defaultCloseOperation", GUI.MainWindow.class, "getDefaultCloseOperation", "setDefaultCloseOperation" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", GUI.MainWindow.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", GUI.MainWindow.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", GUI.MainWindow.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", GUI.MainWindow.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_extendedState] = new PropertyDescriptor ( "extendedState", GUI.MainWindow.class, "getExtendedState", "setExtendedState" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", GUI.MainWindow.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusableWindow] = new PropertyDescriptor ( "focusableWindow", GUI.MainWindow.class, "isFocusableWindow", null ); // NOI18N
            properties[PROPERTY_focusableWindowState] = new PropertyDescriptor ( "focusableWindowState", GUI.MainWindow.class, "getFocusableWindowState", "setFocusableWindowState" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", GUI.MainWindow.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", GUI.MainWindow.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focused] = new PropertyDescriptor ( "focused", GUI.MainWindow.class, "isFocused", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", GUI.MainWindow.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", GUI.MainWindow.class, "getFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", GUI.MainWindow.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", GUI.MainWindow.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", GUI.MainWindow.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", GUI.MainWindow.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", GUI.MainWindow.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", GUI.MainWindow.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", GUI.MainWindow.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", GUI.MainWindow.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", GUI.MainWindow.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", GUI.MainWindow.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_glassPane] = new PropertyDescriptor ( "glassPane", GUI.MainWindow.class, "getGlassPane", "setGlassPane" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", GUI.MainWindow.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", GUI.MainWindow.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", GUI.MainWindow.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", GUI.MainWindow.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", GUI.MainWindow.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_iconImage] = new PropertyDescriptor ( "iconImage", GUI.MainWindow.class, "getIconImage", "setIconImage" ); // NOI18N
            properties[PROPERTY_iconImages] = new PropertyDescriptor ( "iconImages", GUI.MainWindow.class, null, "setIconImages" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", GUI.MainWindow.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", GUI.MainWindow.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", GUI.MainWindow.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", GUI.MainWindow.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", GUI.MainWindow.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_JMenuBar] = new PropertyDescriptor ( "JMenuBar", GUI.MainWindow.class, "getJMenuBar", "setJMenuBar" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", GUI.MainWindow.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layeredPane] = new PropertyDescriptor ( "layeredPane", GUI.MainWindow.class, "getLayeredPane", "setLayeredPane" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", GUI.MainWindow.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", GUI.MainWindow.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", GUI.MainWindow.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", GUI.MainWindow.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationByPlatform] = new PropertyDescriptor ( "locationByPlatform", GUI.MainWindow.class, "isLocationByPlatform", "setLocationByPlatform" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", GUI.MainWindow.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_locationRelativeTo] = new PropertyDescriptor ( "locationRelativeTo", GUI.MainWindow.class, null, "setLocationRelativeTo" ); // NOI18N
            properties[PROPERTY_maximizedBounds] = new PropertyDescriptor ( "maximizedBounds", GUI.MainWindow.class, "getMaximizedBounds", "setMaximizedBounds" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", GUI.MainWindow.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", GUI.MainWindow.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menuBar] = new PropertyDescriptor ( "menuBar", GUI.MainWindow.class, "getMenuBar", "setMenuBar" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", GUI.MainWindow.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", GUI.MainWindow.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_modalExclusionType] = new PropertyDescriptor ( "modalExclusionType", GUI.MainWindow.class, "getModalExclusionType", "setModalExclusionType" ); // NOI18N
            properties[PROPERTY_mostRecentFocusOwner] = new PropertyDescriptor ( "mostRecentFocusOwner", GUI.MainWindow.class, "getMostRecentFocusOwner", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", GUI.MainWindow.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", GUI.MainWindow.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", GUI.MainWindow.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", GUI.MainWindow.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", GUI.MainWindow.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opacity] = new PropertyDescriptor ( "opacity", GUI.MainWindow.class, "getOpacity", "setOpacity" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", GUI.MainWindow.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_ownedWindows] = new PropertyDescriptor ( "ownedWindows", GUI.MainWindow.class, "getOwnedWindows", null ); // NOI18N
            properties[PROPERTY_owner] = new PropertyDescriptor ( "owner", GUI.MainWindow.class, "getOwner", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", GUI.MainWindow.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", GUI.MainWindow.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", GUI.MainWindow.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", GUI.MainWindow.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", GUI.MainWindow.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_rentalTable] = new PropertyDescriptor ( "rentalTable", GUI.MainWindow.class, "getRentalTable", null ); // NOI18N
            properties[PROPERTY_rentalTableModel] = new PropertyDescriptor ( "rentalTableModel", GUI.MainWindow.class, "getRentalTableModel", null ); // NOI18N
            properties[PROPERTY_resizable] = new PropertyDescriptor ( "resizable", GUI.MainWindow.class, "isResizable", "setResizable" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", GUI.MainWindow.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_shape] = new PropertyDescriptor ( "shape", GUI.MainWindow.class, "getShape", "setShape" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", GUI.MainWindow.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", GUI.MainWindow.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_state] = new PropertyDescriptor ( "state", GUI.MainWindow.class, "getState", "setState" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", GUI.MainWindow.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", GUI.MainWindow.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", GUI.MainWindow.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", GUI.MainWindow.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_type] = new PropertyDescriptor ( "type", GUI.MainWindow.class, "getType", "setType" ); // NOI18N
            properties[PROPERTY_undecorated] = new PropertyDescriptor ( "undecorated", GUI.MainWindow.class, "isUndecorated", "setUndecorated" ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", GUI.MainWindow.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", GUI.MainWindow.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", GUI.MainWindow.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_warningString] = new PropertyDescriptor ( "warningString", GUI.MainWindow.class, "getWarningString", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", GUI.MainWindow.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_windowFocusListeners] = new PropertyDescriptor ( "windowFocusListeners", GUI.MainWindow.class, "getWindowFocusListeners", null ); // NOI18N
            properties[PROPERTY_windowListeners] = new PropertyDescriptor ( "windowListeners", GUI.MainWindow.class, "getWindowListeners", null ); // NOI18N
            properties[PROPERTY_windowStateListeners] = new PropertyDescriptor ( "windowStateListeners", GUI.MainWindow.class, "getWindowStateListeners", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", GUI.MainWindow.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", GUI.MainWindow.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_containerListener = 1;
    private static final int EVENT_focusListener = 2;
    private static final int EVENT_hierarchyBoundsListener = 3;
    private static final int EVENT_hierarchyListener = 4;
    private static final int EVENT_inputMethodListener = 5;
    private static final int EVENT_keyListener = 6;
    private static final int EVENT_mouseListener = 7;
    private static final int EVENT_mouseMotionListener = 8;
    private static final int EVENT_mouseWheelListener = 9;
    private static final int EVENT_propertyChangeListener = 10;
    private static final int EVENT_windowFocusListener = 11;
    private static final int EVENT_windowListener = 12;
    private static final int EVENT_windowStateListener = 13;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[14];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( GUI.MainWindow.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( GUI.MainWindow.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( GUI.MainWindow.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( GUI.MainWindow.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( GUI.MainWindow.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( GUI.MainWindow.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( GUI.MainWindow.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( GUI.MainWindow.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( GUI.MainWindow.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( GUI.MainWindow.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( GUI.MainWindow.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_windowFocusListener] = new EventSetDescriptor ( GUI.MainWindow.class, "windowFocusListener", java.awt.event.WindowFocusListener.class, new String[] {"windowGainedFocus", "windowLostFocus"}, "addWindowFocusListener", "removeWindowFocusListener" ); // NOI18N
            eventSets[EVENT_windowListener] = new EventSetDescriptor ( GUI.MainWindow.class, "windowListener", java.awt.event.WindowListener.class, new String[] {"windowOpened", "windowClosing", "windowClosed", "windowIconified", "windowDeiconified", "windowActivated", "windowDeactivated"}, "addWindowListener", "removeWindowListener" ); // NOI18N
            eventSets[EVENT_windowStateListener] = new EventSetDescriptor ( GUI.MainWindow.class, "windowStateListener", java.awt.event.WindowStateListener.class, new String[] {"windowStateChanged"}, "addWindowStateListener", "removeWindowStateListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_applyResourceBundle10 = 10;
    private static final int METHOD_applyResourceBundle11 = 11;
    private static final int METHOD_areFocusTraversalKeysSet12 = 12;
    private static final int METHOD_bounds13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createBufferStrategy19 = 19;
    private static final int METHOD_createBufferStrategy20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_deliverEvent25 = 25;
    private static final int METHOD_disable26 = 26;
    private static final int METHOD_dispatchEvent27 = 27;
    private static final int METHOD_dispose28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enableInputMethods32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_getBaseline41 = 41;
    private static final int METHOD_getBicycleManager42 = 42;
    private static final int METHOD_getBounds43 = 43;
    private static final int METHOD_getComponentAt44 = 44;
    private static final int METHOD_getComponentAt45 = 45;
    private static final int METHOD_getComponentZOrder46 = 46;
    private static final int METHOD_getCursor47 = 47;
    private static final int METHOD_getCustomerManager48 = 48;
    private static final int METHOD_getFontMetrics49 = 49;
    private static final int METHOD_getFrames50 = 50;
    private static final int METHOD_getIconImages51 = 51;
    private static final int METHOD_getListeners52 = 52;
    private static final int METHOD_getLocation53 = 53;
    private static final int METHOD_getMessage54 = 54;
    private static final int METHOD_getMousePosition55 = 55;
    private static final int METHOD_getOwnerlessWindows56 = 56;
    private static final int METHOD_getPropertyChangeListeners57 = 57;
    private static final int METHOD_getRentalManager58 = 58;
    private static final int METHOD_getSize59 = 59;
    private static final int METHOD_getWindows60 = 60;
    private static final int METHOD_gotFocus61 = 61;
    private static final int METHOD_handleEvent62 = 62;
    private static final int METHOD_hasFocus63 = 63;
    private static final int METHOD_hide64 = 64;
    private static final int METHOD_imageUpdate65 = 65;
    private static final int METHOD_insets66 = 66;
    private static final int METHOD_inside67 = 67;
    private static final int METHOD_invalidate68 = 68;
    private static final int METHOD_isAncestorOf69 = 69;
    private static final int METHOD_isDefaultLookAndFeelDecorated70 = 70;
    private static final int METHOD_isFocusCycleRoot71 = 71;
    private static final int METHOD_isFocusOwner72 = 72;
    private static final int METHOD_keyDown73 = 73;
    private static final int METHOD_keyUp74 = 74;
    private static final int METHOD_layout75 = 75;
    private static final int METHOD_list76 = 76;
    private static final int METHOD_list77 = 77;
    private static final int METHOD_list78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_locate81 = 81;
    private static final int METHOD_location82 = 82;
    private static final int METHOD_lostFocus83 = 83;
    private static final int METHOD_main84 = 84;
    private static final int METHOD_minimumSize85 = 85;
    private static final int METHOD_mouseDown86 = 86;
    private static final int METHOD_mouseDrag87 = 87;
    private static final int METHOD_mouseEnter88 = 88;
    private static final int METHOD_mouseExit89 = 89;
    private static final int METHOD_mouseMove90 = 90;
    private static final int METHOD_mouseUp91 = 91;
    private static final int METHOD_move92 = 92;
    private static final int METHOD_nextFocus93 = 93;
    private static final int METHOD_pack94 = 94;
    private static final int METHOD_paint95 = 95;
    private static final int METHOD_paintAll96 = 96;
    private static final int METHOD_paintComponents97 = 97;
    private static final int METHOD_postEvent98 = 98;
    private static final int METHOD_preferredSize99 = 99;
    private static final int METHOD_prepareImage100 = 100;
    private static final int METHOD_prepareImage101 = 101;
    private static final int METHOD_print102 = 102;
    private static final int METHOD_printAll103 = 103;
    private static final int METHOD_printComponents104 = 104;
    private static final int METHOD_remove105 = 105;
    private static final int METHOD_remove106 = 106;
    private static final int METHOD_remove107 = 107;
    private static final int METHOD_removeAll108 = 108;
    private static final int METHOD_removeNotify109 = 109;
    private static final int METHOD_removePropertyChangeListener110 = 110;
    private static final int METHOD_repaint111 = 111;
    private static final int METHOD_repaint112 = 112;
    private static final int METHOD_repaint113 = 113;
    private static final int METHOD_repaint114 = 114;
    private static final int METHOD_requestFocus115 = 115;
    private static final int METHOD_requestFocusInWindow116 = 116;
    private static final int METHOD_reshape117 = 117;
    private static final int METHOD_resize118 = 118;
    private static final int METHOD_resize119 = 119;
    private static final int METHOD_revalidate120 = 120;
    private static final int METHOD_setBounds121 = 121;
    private static final int METHOD_setComponentZOrder122 = 122;
    private static final int METHOD_setCursor123 = 123;
    private static final int METHOD_setDefaultLookAndFeelDecorated124 = 124;
    private static final int METHOD_setFocusTraversalKeys125 = 125;
    private static final int METHOD_show126 = 126;
    private static final int METHOD_show127 = 127;
    private static final int METHOD_size128 = 128;
    private static final int METHOD_toBack129 = 129;
    private static final int METHOD_toFront130 = 130;
    private static final int METHOD_toString131 = 131;
    private static final int METHOD_transferFocus132 = 132;
    private static final int METHOD_transferFocusBackward133 = 133;
    private static final int METHOD_transferFocusDownCycle134 = 134;
    private static final int METHOD_transferFocusUpCycle135 = 135;
    private static final int METHOD_update136 = 136;
    private static final int METHOD_validate137 = 137;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[138];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(java.awt.Frame.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Window.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle10] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.util.ResourceBundle.class})); // NOI18N
            methods[METHOD_applyResourceBundle10].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle11] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_applyResourceBundle11].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet12] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet12].setDisplayName ( "" );
            methods[METHOD_bounds13] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy19] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class})); // NOI18N
            methods[METHOD_createBufferStrategy19].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy20] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class, java.awt.BufferCapabilities.class})); // NOI18N
            methods[METHOD_createBufferStrategy20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_deliverEvent25] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent25].setDisplayName ( "" );
            methods[METHOD_disable26] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable26].setDisplayName ( "" );
            methods[METHOD_dispatchEvent27] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent27].setDisplayName ( "" );
            methods[METHOD_dispose28] = new MethodDescriptor(java.awt.Window.class.getMethod("dispose", new Class[] {})); // NOI18N
            methods[METHOD_dispose28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_getBaseline41] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline41].setDisplayName ( "" );
            methods[METHOD_getBicycleManager42] = new MethodDescriptor(GUI.MainWindow.class.getMethod("getBicycleManager", new Class[] {})); // NOI18N
            methods[METHOD_getBicycleManager42].setDisplayName ( "" );
            methods[METHOD_getBounds43] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds43].setDisplayName ( "" );
            methods[METHOD_getComponentAt44] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt44].setDisplayName ( "" );
            methods[METHOD_getComponentAt45] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt45].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder46].setDisplayName ( "" );
            methods[METHOD_getCursor47] = new MethodDescriptor(java.awt.Component.class.getMethod("getCursor", new Class[] {})); // NOI18N
            methods[METHOD_getCursor47].setDisplayName ( "" );
            methods[METHOD_getCustomerManager48] = new MethodDescriptor(GUI.MainWindow.class.getMethod("getCustomerManager", new Class[] {})); // NOI18N
            methods[METHOD_getCustomerManager48].setDisplayName ( "" );
            methods[METHOD_getFontMetrics49] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics49].setDisplayName ( "" );
            methods[METHOD_getFrames50] = new MethodDescriptor(java.awt.Frame.class.getMethod("getFrames", new Class[] {})); // NOI18N
            methods[METHOD_getFrames50].setDisplayName ( "" );
            methods[METHOD_getIconImages51] = new MethodDescriptor(java.awt.Window.class.getMethod("getIconImages", new Class[] {})); // NOI18N
            methods[METHOD_getIconImages51].setDisplayName ( "" );
            methods[METHOD_getListeners52] = new MethodDescriptor(java.awt.Window.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners52].setDisplayName ( "" );
            methods[METHOD_getLocation53] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation53].setDisplayName ( "" );
            methods[METHOD_getMessage54] = new MethodDescriptor(GUI.MainWindow.class.getMethod("getMessage", new Class[] {java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_getMessage54].setDisplayName ( "" );
            methods[METHOD_getMousePosition55] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition55].setDisplayName ( "" );
            methods[METHOD_getOwnerlessWindows56] = new MethodDescriptor(java.awt.Window.class.getMethod("getOwnerlessWindows", new Class[] {})); // NOI18N
            methods[METHOD_getOwnerlessWindows56].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners57] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners57].setDisplayName ( "" );
            methods[METHOD_getRentalManager58] = new MethodDescriptor(GUI.MainWindow.class.getMethod("getRentalManager", new Class[] {})); // NOI18N
            methods[METHOD_getRentalManager58].setDisplayName ( "" );
            methods[METHOD_getSize59] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize59].setDisplayName ( "" );
            methods[METHOD_getWindows60] = new MethodDescriptor(java.awt.Window.class.getMethod("getWindows", new Class[] {})); // NOI18N
            methods[METHOD_getWindows60].setDisplayName ( "" );
            methods[METHOD_gotFocus61] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus61].setDisplayName ( "" );
            methods[METHOD_handleEvent62] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent62].setDisplayName ( "" );
            methods[METHOD_hasFocus63] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus63].setDisplayName ( "" );
            methods[METHOD_hide64] = new MethodDescriptor(java.awt.Window.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide64].setDisplayName ( "" );
            methods[METHOD_imageUpdate65] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate65].setDisplayName ( "" );
            methods[METHOD_insets66] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets66].setDisplayName ( "" );
            methods[METHOD_inside67] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside67].setDisplayName ( "" );
            methods[METHOD_invalidate68] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate68].setDisplayName ( "" );
            methods[METHOD_isAncestorOf69] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf69].setDisplayName ( "" );
            methods[METHOD_isDefaultLookAndFeelDecorated70] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("isDefaultLookAndFeelDecorated", new Class[] {})); // NOI18N
            methods[METHOD_isDefaultLookAndFeelDecorated70].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot71] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot71].setDisplayName ( "" );
            methods[METHOD_isFocusOwner72] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusOwner", new Class[] {})); // NOI18N
            methods[METHOD_isFocusOwner72].setDisplayName ( "" );
            methods[METHOD_keyDown73] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown73].setDisplayName ( "" );
            methods[METHOD_keyUp74] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp74].setDisplayName ( "" );
            methods[METHOD_layout75] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout75].setDisplayName ( "" );
            methods[METHOD_list76] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list76].setDisplayName ( "" );
            methods[METHOD_list77] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list77].setDisplayName ( "" );
            methods[METHOD_list78] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list78].setDisplayName ( "" );
            methods[METHOD_list79] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_locate81] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate81].setDisplayName ( "" );
            methods[METHOD_location82] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location82].setDisplayName ( "" );
            methods[METHOD_lostFocus83] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus83].setDisplayName ( "" );
            methods[METHOD_main84] = new MethodDescriptor(GUI.MainWindow.class.getMethod("main", new Class[] {java.lang.String[].class})); // NOI18N
            methods[METHOD_main84].setDisplayName ( "" );
            methods[METHOD_minimumSize85] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize85].setDisplayName ( "" );
            methods[METHOD_mouseDown86] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown86].setDisplayName ( "" );
            methods[METHOD_mouseDrag87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag87].setDisplayName ( "" );
            methods[METHOD_mouseEnter88] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter88].setDisplayName ( "" );
            methods[METHOD_mouseExit89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit89].setDisplayName ( "" );
            methods[METHOD_mouseMove90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove90].setDisplayName ( "" );
            methods[METHOD_mouseUp91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp91].setDisplayName ( "" );
            methods[METHOD_move92] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move92].setDisplayName ( "" );
            methods[METHOD_nextFocus93] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus93].setDisplayName ( "" );
            methods[METHOD_pack94] = new MethodDescriptor(java.awt.Window.class.getMethod("pack", new Class[] {})); // NOI18N
            methods[METHOD_pack94].setDisplayName ( "" );
            methods[METHOD_paint95] = new MethodDescriptor(java.awt.Window.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint95].setDisplayName ( "" );
            methods[METHOD_paintAll96] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll96].setDisplayName ( "" );
            methods[METHOD_paintComponents97] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents97].setDisplayName ( "" );
            methods[METHOD_postEvent98] = new MethodDescriptor(java.awt.Window.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent98].setDisplayName ( "" );
            methods[METHOD_preferredSize99] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize99].setDisplayName ( "" );
            methods[METHOD_prepareImage100] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage100].setDisplayName ( "" );
            methods[METHOD_prepareImage101] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage101].setDisplayName ( "" );
            methods[METHOD_print102] = new MethodDescriptor(java.awt.Container.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print102].setDisplayName ( "" );
            methods[METHOD_printAll103] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll103].setDisplayName ( "" );
            methods[METHOD_printComponents104] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents104].setDisplayName ( "" );
            methods[METHOD_remove105] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove105].setDisplayName ( "" );
            methods[METHOD_remove106] = new MethodDescriptor(java.awt.Frame.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove106].setDisplayName ( "" );
            methods[METHOD_remove107] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove107].setDisplayName ( "" );
            methods[METHOD_removeAll108] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll108].setDisplayName ( "" );
            methods[METHOD_removeNotify109] = new MethodDescriptor(java.awt.Frame.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify109].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener110] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener110].setDisplayName ( "" );
            methods[METHOD_repaint111] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint111].setDisplayName ( "" );
            methods[METHOD_repaint112] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint112].setDisplayName ( "" );
            methods[METHOD_repaint113] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint113].setDisplayName ( "" );
            methods[METHOD_repaint114] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint114].setDisplayName ( "" );
            methods[METHOD_requestFocus115] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus115].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow116] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow116].setDisplayName ( "" );
            methods[METHOD_reshape117] = new MethodDescriptor(java.awt.Window.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape117].setDisplayName ( "" );
            methods[METHOD_resize118] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize118].setDisplayName ( "" );
            methods[METHOD_resize119] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize119].setDisplayName ( "" );
            methods[METHOD_revalidate120] = new MethodDescriptor(java.awt.Component.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate120].setDisplayName ( "" );
            methods[METHOD_setBounds121] = new MethodDescriptor(java.awt.Window.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds121].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder122] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder122].setDisplayName ( "" );
            methods[METHOD_setCursor123] = new MethodDescriptor(java.awt.Window.class.getMethod("setCursor", new Class[] {java.awt.Cursor.class})); // NOI18N
            methods[METHOD_setCursor123].setDisplayName ( "" );
            methods[METHOD_setDefaultLookAndFeelDecorated124] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("setDefaultLookAndFeelDecorated", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_setDefaultLookAndFeelDecorated124].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys125] = new MethodDescriptor(java.awt.Container.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys125].setDisplayName ( "" );
            methods[METHOD_show126] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show126].setDisplayName ( "" );
            methods[METHOD_show127] = new MethodDescriptor(java.awt.Window.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show127].setDisplayName ( "" );
            methods[METHOD_size128] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size128].setDisplayName ( "" );
            methods[METHOD_toBack129] = new MethodDescriptor(java.awt.Window.class.getMethod("toBack", new Class[] {})); // NOI18N
            methods[METHOD_toBack129].setDisplayName ( "" );
            methods[METHOD_toFront130] = new MethodDescriptor(java.awt.Window.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront130].setDisplayName ( "" );
            methods[METHOD_toString131] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString131].setDisplayName ( "" );
            methods[METHOD_transferFocus132] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus132].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward133] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward133].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle134] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle134].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle135] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle135].setDisplayName ( "" );
            methods[METHOD_update136] = new MethodDescriptor(javax.swing.JFrame.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update136].setDisplayName ( "" );
            methods[METHOD_validate137] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate137].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
