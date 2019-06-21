// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qwidget.h

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QWidget extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QWidget(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QWidget(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QWidget position(long position) {
        return (QWidget)super.position(position);
    }
    public QPaintDevice asQPaintDevice() { return asQPaintDevice(this); }
    @Namespace public static native @Name("static_cast<QPaintDevice*>") QPaintDevice asQPaintDevice(QWidget pointer);

    /** enum QWidget::RenderFlag */
    public static final int
        DrawWindowBackground = 0x1,
        DrawChildren = 0x2,
        IgnoreMask = 0x4;
//     #define Q_DECLARE_FLAGS(arg0, arg1)(RenderFlags, RenderFlag)

    public QWidget(QWidget parent/*=nullptr*/, @ByVal(nullValue = "Qt::WindowFlags()") @Cast("Qt::WindowFlags") int f) { super((Pointer)null); allocate(parent, f); }
    private native void allocate(QWidget parent/*=nullptr*/, @ByVal(nullValue = "Qt::WindowFlags()") @Cast("Qt::WindowFlags") int f);
    public QWidget() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native int devType();

    public native @Cast("size_t") long winId();
    public native void createWinId(); // internal, going away
    public native @Cast("size_t") long internalWinId();
    public native @Cast("size_t") long effectiveWinId();

    // GUI style setting
    public native QStyle style();
    public native void setStyle(QStyle arg0);
    // Widget types and states

    public native @Cast("bool") boolean isTopLevel();
    public native @Cast("bool") boolean isWindow();

    public native @Cast("bool") boolean isModal();
    public native @Cast("Qt::WindowModality") int windowModality();
    public native void setWindowModality(@Cast("Qt::WindowModality") int windowModality);

    public native @Cast("bool") boolean isEnabled();
    public native @Cast("bool") boolean isEnabledTo(@Const QWidget arg0);
    public native void setEnabled(@Cast("bool") boolean arg0);
    public native void setDisabled(@Cast("bool") boolean arg0);
    public native void setWindowModified(@Cast("bool") boolean arg0);

    public native int x();
    public native int y();
    public native @ByVal QSize frameSize();
    public native @ByVal QSize size();
    public native int width();
    public native int height();

    public native @ByVal QSize minimumSize();
    public native @ByVal QSize maximumSize();
    public native int minimumWidth();
    public native int minimumHeight();
    public native int maximumWidth();
    public native int maximumHeight();
    public native void setMinimumSize(@Const @ByRef QSize arg0);
    public native void setMinimumSize(int minw, int minh);
    public native void setMaximumSize(@Const @ByRef QSize arg0);
    public native void setMaximumSize(int maxw, int maxh);
    public native void setMinimumWidth(int minw);
    public native void setMinimumHeight(int minh);
    public native void setMaximumWidth(int maxw);
    public native void setMaximumHeight(int maxh);

// #ifdef Q_QDOC
    
// #endif

    public native @ByVal QSize sizeIncrement();
    public native void setSizeIncrement(@Const @ByRef QSize arg0);
    public native void setSizeIncrement(int w, int h);
    public native @ByVal QSize baseSize();
    public native void setBaseSize(@Const @ByRef QSize arg0);
    public native void setBaseSize(int basew, int baseh);

    public native void setFixedSize(@Const @ByRef QSize arg0);
    public native void setFixedSize(int w, int h);
    public native void setFixedWidth(int w);
    public native void setFixedHeight(int h);

    // Widget coordinate mapping

    public native QWidget window();
    public native QWidget nativeParentWidget();
    public native QWidget topLevelWidget();

    // Widget appearance functions

    public native @Const @ByRef QFont font();
    public native void setFont(@Const @ByRef QFont arg0);

// #ifndef QT_NO_CURSOR
    public native void unsetCursor();
// #endif

    public native void setMouseTracking(@Cast("bool") boolean enable);
    public native @Cast("bool") boolean hasMouseTracking();
    public native @Cast("bool") boolean underMouse();

    public native void setTabletTracking(@Cast("bool") boolean enable);
    public native @Cast("bool") boolean hasTabletTracking();
    public native void clearMask();

    public native void render(QPaintDevice target);

// #if QT_CONFIG(graphicseffect)
// #endif // QT_CONFIG(graphicseffect)

// #ifndef QT_NO_GESTURES
    public native void grabGesture(@Cast("Qt::GestureType") long type);
    public native void ungrabGesture(@Cast("Qt::GestureType") long type);
    public native void setWindowTitle(@Const @ByRef QString arg0);
// #ifndef QT_NO_STYLE_STYLESHEET
    public native void setStyleSheet(@Const @ByRef QString styleSheet);
// #ifndef QT_NO_STYLE_STYLESHEET
    public native @ByVal QString styleSheet();
// #endif
    public native @ByVal QString windowTitle();
    public native void setWindowIcon(@Const @ByRef QIcon icon);
    public native @ByVal QIcon windowIcon();
    public native void setWindowIconText(@Const @ByRef QString arg0);
    public native @ByVal QString windowIconText();
    public native void setWindowRole(@Const @ByRef QString arg0);
    public native @ByVal QString windowRole();
    public native void setWindowFilePath(@Const @ByRef QString filePath);
    public native @ByVal QString windowFilePath();

    public native void setWindowOpacity(double level);
    public native double windowOpacity();

    public native @Cast("bool") boolean isWindowModified();
// #ifndef QT_NO_TOOLTIP
    public native void setToolTip(@Const @ByRef QString arg0);
    public native @ByVal QString toolTip();
    public native void setToolTipDuration(int msec);
    public native int toolTipDuration();
// #endif
// #if QT_CONFIG(statustip)
    public native void setStatusTip(@Const @ByRef QString arg0);
    public native @ByVal QString statusTip();
// #endif
// #if QT_CONFIG(whatsthis)
    public native void setWhatsThis(@Const @ByRef QString arg0);
    public native @ByVal QString whatsThis();
// #endif
// #ifndef QT_NO_ACCESSIBILITY
    public native @ByVal QString accessibleName();
    public native void setAccessibleName(@Const @ByRef QString name);
    public native @ByVal QString accessibleDescription();
    public native void setAccessibleDescription(@Const @ByRef QString description);
// #endif

    public native void setLayoutDirection(@Cast("Qt::LayoutDirection") int direction);
    public native @Cast("Qt::LayoutDirection") int layoutDirection();
    public native void unsetLayoutDirection();
    public native void unsetLocale();

    public native @Cast("bool") boolean isRightToLeft();
    public native @Cast("bool") boolean isLeftToRight();
    public native void setFocus();
    public native @Cast("bool") boolean isActiveWindow();
    public native void activateWindow();
    public native void clearFocus();

    public native void setFocus(@Cast("Qt::FocusReason") int reason);
    public native @Cast("Qt::FocusPolicy") int focusPolicy();
    public native void setFocusPolicy(@Cast("Qt::FocusPolicy") int policy);
    public native @Cast("bool") boolean hasFocus();
    public static native void setTabOrder(QWidget arg0, QWidget arg1);
    public native void setFocusProxy(QWidget arg0);
    public native QWidget focusProxy();
    public native @Cast("Qt::ContextMenuPolicy") int contextMenuPolicy();
    public native void setContextMenuPolicy(@Cast("Qt::ContextMenuPolicy") int policy);

    // Grab functions
    public native void grabMouse();
// #ifndef QT_NO_CURSOR
// #endif
    public native void releaseMouse();
    public native void grabKeyboard();
    public native void releaseKeyboard();
// #ifndef QT_NO_SHORTCUT
    public native void releaseShortcut(int id);
    public native void setShortcutEnabled(int id, @Cast("bool") boolean enable/*=true*/);
    public native void setShortcutEnabled(int id);
    public native void setShortcutAutoRepeat(int id, @Cast("bool") boolean enable/*=true*/);
    public native void setShortcutAutoRepeat(int id);
// #endif
    public static native QWidget mouseGrabber();
    public static native QWidget keyboardGrabber();

    // Update/refresh functions
    public native @Cast("bool") boolean updatesEnabled();
    public native void setUpdatesEnabled(@Cast("bool") boolean enable);

// #if QT_CONFIG(graphicsview)
    public native void update();
    public native void repaint();
    public native void update(int x, int y, int w, int h);

    public native void repaint(int x, int y, int w, int h);
    // Widget management functions

    
    public native void setHidden(@Cast("bool") boolean hidden);
    public native void show();
    public native void hide();

    public native void showMinimized();
    public native void showMaximized();
    public native void showFullScreen();
    public native void showNormal();

    public native @Cast("bool") @Name("close") boolean _close();
    public native void raise();
    public native void lower();
    public native void stackUnder(QWidget arg0);
    public native void move(int x, int y);
    public native void resize(int w, int h);
    public native void resize(@Const @ByRef QSize arg0);
    public native void setGeometry(int x, int y, int w, int h);
    public native @ByVal QByteArray saveGeometry();
    public native @Cast("bool") boolean restoreGeometry(@Const @ByRef QByteArray geometry);
    public native void adjustSize();
    public native @Cast("bool") boolean isVisible();
    public native @Cast("bool") boolean isVisibleTo(@Const QWidget arg0);
    public native @Cast("bool") boolean isHidden();

    public native @Cast("bool") boolean isMinimized();
    public native @Cast("bool") boolean isMaximized();
    public native @Cast("bool") boolean isFullScreen();

    
    

    public native @ByVal QSizePolicy sizePolicy();
    public native void setSizePolicy(@ByVal QSizePolicy arg0);
    public native void setSizePolicy(@Cast("QSizePolicy::Policy") int horizontal, @Cast("QSizePolicy::Policy") int vertical);
    
    

    public native void setContentsMargins(int left, int top, int right, int bottom);
    public native void getContentsMargins(IntPointer left, IntPointer top, IntPointer right, IntPointer bottom);
    public native void getContentsMargins(IntBuffer left, IntBuffer top, IntBuffer right, IntBuffer bottom);
    public native void getContentsMargins(int[] left, int[] top, int[] right, int[] bottom);
    public native QLayout layout();
    public native void setLayout(QLayout arg0);
    public native void updateGeometry();

    public native void setParent(QWidget parent);
    public native void setParent(QWidget parent, @ByVal @Cast("Qt::WindowFlags") int f);

    public native void scroll(int dx, int dy);

    // Misc. functions

    public native QWidget focusWidget();
    public native QWidget nextInFocusChain();
    public native QWidget previousInFocusChain();

    // drag and drop
    public native @Cast("bool") boolean acceptDrops();
    public native void setAcceptDrops(@Cast("bool") boolean on);

// #ifndef QT_NO_ACTION
    //actions
    public native void addAction(QAction action);
// #if QT_VERSION >= QT_VERSION_CHECK(6,0,0)
// #else
// #endif
    public native void insertAction(QAction before, QAction action);
    public native void removeAction(QAction action);
// #endif

    public native QWidget parentWidget();

    public native void setWindowFlags(@ByVal @Cast("Qt::WindowFlags") int type);
    public native @ByVal @Cast("Qt::WindowFlags") int windowFlags();
    public native void setWindowFlag(@Cast("Qt::WindowType") int arg0, @Cast("bool") boolean on/*=true*/);
    public native void setWindowFlag(@Cast("Qt::WindowType") int arg0);
    public native void overrideWindowFlags(@ByVal @Cast("Qt::WindowFlags") int type);

    public native @Cast("Qt::WindowType") int windowType();

    public static native QWidget find(@Cast("size_t") long arg0);
    public native QWidget childAt(int x, int y);

    public native void setAttribute(@Cast("Qt::WidgetAttribute") int arg0, @Cast("bool") boolean on/*=true*/);
    public native void setAttribute(@Cast("Qt::WidgetAttribute") int arg0);
    public native @Cast("bool") boolean testAttribute(@Cast("Qt::WidgetAttribute") int arg0);

    public native void ensurePolished();

    public native @Cast("bool") boolean isAncestorOf(@Const QWidget child);

// #ifdef QT_KEYPAD_NAVIGATION
// #endif

    public native @Cast("bool") boolean autoFillBackground();
    public native void setAutoFillBackground(@Cast("bool") boolean enabled);
    @Virtual protected native void closeEvent(QCloseEvent event);
    
}
