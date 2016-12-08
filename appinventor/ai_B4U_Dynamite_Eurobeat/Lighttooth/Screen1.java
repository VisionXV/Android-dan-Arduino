package appinventor.ai_B4U_Dynamite_Eurobeat.Lighttooth;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.SetExp;
import gnu.kawa.functions.ArithOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.ParseFormat;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.Sequence;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import gnu.text.PrettyWriter;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final FString Lit10;
    static final SimpleSymbol Lit100;
    static final FString Lit101;
    static final PairWithPosition Lit102;
    static final SimpleSymbol Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final FString Lit106;
    static final PairWithPosition Lit107;
    static final SimpleSymbol Lit108;
    static final FString Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final FString Lit111;
    static final FString Lit112;
    static final SimpleSymbol Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final FString Lit117;
    static final PairWithPosition Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final FString Lit122;
    static final PairWithPosition Lit123;
    static final SimpleSymbol Lit124;
    static final FString Lit125;
    static final SimpleSymbol Lit126;
    static final FString Lit127;
    static final FString Lit128;
    static final SimpleSymbol Lit129;
    static final IntNum Lit13;
    static final FString Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final FString Lit133;
    static final PairWithPosition Lit134;
    static final SimpleSymbol Lit135;
    static final FString Lit136;
    static final SimpleSymbol Lit137;
    static final FString Lit138;
    static final PairWithPosition Lit139;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final FString Lit143;
    static final SimpleSymbol Lit144;
    static final IntNum Lit145;
    static final IntNum Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final FString Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final SimpleSymbol Lit156;
    static final SimpleSymbol Lit157;
    static final SimpleSymbol Lit158;
    static final SimpleSymbol Lit159;
    static final IntNum Lit16;
    static final SimpleSymbol Lit160;
    static final SimpleSymbol Lit161;
    static final SimpleSymbol Lit162;
    static final SimpleSymbol Lit17;
    static final FString Lit18;
    static final FString Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final IntNum Lit22;
    static final FString Lit23;
    static final FString Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final FString Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final PairWithPosition Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final FString Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final IntNum Lit41;
    static final FString Lit42;
    static final FString Lit43;
    static final SimpleSymbol Lit44;
    static final FString Lit45;
    static final FString Lit46;
    static final SimpleSymbol Lit47;
    static final FString Lit48;
    static final FString Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final PairWithPosition Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final FString Lit58;
    static final PairWithPosition Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final PairWithPosition Lit70;
    static final SimpleSymbol Lit71;
    static final FString Lit72;
    static final SimpleSymbol Lit73;
    static final FString Lit74;
    static final PairWithPosition Lit75;
    static final SimpleSymbol Lit76;
    static final FString Lit77;
    static final SimpleSymbol Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final FString Lit83;
    static final SimpleSymbol Lit84;
    static final FString Lit85;
    static final PairWithPosition Lit86;
    static final SimpleSymbol Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final PairWithPosition Lit91;
    static final SimpleSymbol Lit92;
    static final FString Lit93;
    static final SimpleSymbol Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final FString Lit98;
    static final FString Lit99;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public BluetoothClient BluetoothClient1;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public ListPicker ListPicker1;
    public final ModuleMethod ListPicker1$AfterPicking;
    public final ModuleMethod ListPicker1$BeforePicking;
    public Button OFF;
    public final ModuleMethod OFF$Click;
    public Button OFF1;
    public final ModuleMethod OFF1$Click;
    public Button OFF2;
    public final ModuleMethod OFF2$Click;
    public Button OFF3;
    public final ModuleMethod OFF3$Click;
    public Button OFF4;
    public final ModuleMethod OFF4$Click;
    public Button OFFA;
    public final ModuleMethod OFFA$Click;
    public Button ON;
    public final ModuleMethod ON$Click;
    public Button ON1;
    public final ModuleMethod ON1$Click;
    public Button ON2;
    public final ModuleMethod ON2$Click;
    public Button ON3;
    public final ModuleMethod ON3$Click;
    public Button ON4;
    public final ModuleMethod ON4$Click;
    public Button ONA;
    public final ModuleMethod ONA$Click;
    public final ModuleMethod Screen1$BackPressed;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public Label hasilBluetooth;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT /*6*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.IOR /*14*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case ArithOp.AND /*13*/:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_LEFT /*10*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case ArithOp.AND /*13*/:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT /*6*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case ArithOp.IOR /*14*/:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return Screen1.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Screen1.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return this.$main.Screen1$BackPressed();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Screen1.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Screen1.lambda5();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Screen1.lambda6();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Screen1.lambda7();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Screen1.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Screen1.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return this.$main.ListPicker1$BeforePicking();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return this.$main.ListPicker1$AfterPicking();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Screen1.lambda10();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Screen1.lambda11();
                case Sequence.CHAR_VALUE /*29*/:
                    return Screen1.lambda12();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Screen1.lambda13();
                case Sequence.CDATA_VALUE /*31*/:
                    return Screen1.lambda14();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Screen1.lambda15();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Screen1.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Screen1.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return this.$main.ON$Click();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Screen1.lambda18();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Screen1.lambda19();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return this.$main.OFF$Click();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return Screen1.lambda20();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return Screen1.lambda21();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Screen1.lambda22();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Screen1.lambda23();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Screen1.lambda24();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Screen1.lambda25();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return this.$main.ON1$Click();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return Screen1.lambda26();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Screen1.lambda27();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return this.$main.OFF1$Click();
                case 49:
                    return Screen1.lambda28();
                case 50:
                    return Screen1.lambda29();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return Screen1.lambda31();
                case 53:
                    return Screen1.lambda32();
                case 54:
                    return Screen1.lambda33();
                case 55:
                    return this.$main.ON2$Click();
                case 56:
                    return Screen1.lambda34();
                case 57:
                    return Screen1.lambda35();
                case 58:
                    return this.$main.OFF2$Click();
                case 59:
                    return Screen1.lambda36();
                case 60:
                    return Screen1.lambda37();
                case 61:
                    return Screen1.lambda38();
                case 62:
                    return Screen1.lambda39();
                case 63:
                    return Screen1.lambda40();
                case SetExp.HAS_VALUE /*64*/:
                    return Screen1.lambda41();
                case 65:
                    return this.$main.ON3$Click();
                case 66:
                    return Screen1.lambda42();
                case 67:
                    return Screen1.lambda43();
                case 68:
                    return this.$main.OFF3$Click();
                case 69:
                    return Screen1.lambda44();
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    return Screen1.lambda45();
                case 71:
                    return Screen1.lambda46();
                case 72:
                    return Screen1.lambda47();
                case 73:
                    return Screen1.lambda48();
                case 74:
                    return Screen1.lambda49();
                case 75:
                    return this.$main.ON4$Click();
                case PrettyWriter.NEWLINE_LITERAL /*76*/:
                    return Screen1.lambda50();
                case PrettyWriter.NEWLINE_MISER /*77*/:
                    return Screen1.lambda51();
                case PrettyWriter.NEWLINE_LINEAR /*78*/:
                    return this.$main.OFF4$Click();
                case 79:
                    return Screen1.lambda52();
                case 80:
                    return Screen1.lambda53();
                case 81:
                    return Screen1.lambda54();
                case PrettyWriter.NEWLINE_MANDATORY /*82*/:
                    return Screen1.lambda55();
                case PrettyWriter.NEWLINE_SPACE /*83*/:
                    return Screen1.lambda56();
                case 84:
                    return Screen1.lambda57();
                case 85:
                    return this.$main.ONA$Click();
                case 86:
                    return Screen1.lambda58();
                case 87:
                    return Screen1.lambda59();
                case 88:
                    return this.$main.OFFA$Click();
                case 89:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.PROCEDURE /*16*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U8_VALUE /*17*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S8_VALUE /*18*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U16_VALUE /*19*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S16_VALUE /*20*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U32_VALUE /*21*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S32_VALUE /*22*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U64_VALUE /*23*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S64_VALUE /*24*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.FLOAT_VALUE /*25*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOUBLE_VALUE /*26*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.BOOLEAN_VALUE /*27*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CHAR_VALUE /*29*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CDATA_VALUE /*31*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.SET_IF_UNBOUND /*32*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ELEMENT_VALUE /*33*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOCUMENT_VALUE /*34*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.COMMENT_VALUE /*36*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.STRING_TYPE_CODE /*38*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ID_TYPE_CODE /*45*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.HAS_VALUE /*64*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_LITERAL /*76*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_MISER /*77*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_LINEAR /*78*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_MANDATORY /*82*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_SPACE /*83*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit162 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit161 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit160 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit159 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit158 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit157 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit156 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit155 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit154 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit153 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit152 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit151 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit150 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit149 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit148 = (SimpleSymbol) new SimpleSymbol("Timer").readResolve();
        Lit147 = (SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve();
        Lit146 = IntNum.make((int) Component.COLOR_RED);
        Lit145 = IntNum.make((int) Component.COLOR_GREEN);
        Lit144 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit143 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit142 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit141 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit140 = (SimpleSymbol) new SimpleSymbol("OFFA$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit139 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 1118290);
        Lit138 = new FString("com.google.appinventor.components.runtime.Button");
        Lit137 = (SimpleSymbol) new SimpleSymbol("OFFA").readResolve();
        Lit136 = new FString("com.google.appinventor.components.runtime.Button");
        Lit135 = (SimpleSymbol) new SimpleSymbol("ONA$Click").readResolve();
        Lit134 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 1081426);
        Lit133 = new FString("com.google.appinventor.components.runtime.Button");
        Lit132 = (SimpleSymbol) new SimpleSymbol("ONA").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.Button");
        Lit130 = new FString("com.google.appinventor.components.runtime.Label");
        Lit129 = (SimpleSymbol) new SimpleSymbol("Label6").readResolve();
        Lit128 = new FString("com.google.appinventor.components.runtime.Label");
        Lit127 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit126 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve();
        Lit125 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit124 = (SimpleSymbol) new SimpleSymbol("OFF4$Click").readResolve();
        Lit123 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 970834);
        Lit122 = new FString("com.google.appinventor.components.runtime.Button");
        Lit121 = (SimpleSymbol) new SimpleSymbol("OFF4").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.Button");
        Lit119 = (SimpleSymbol) new SimpleSymbol("ON4$Click").readResolve();
        Lit118 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 933970);
        Lit117 = new FString("com.google.appinventor.components.runtime.Button");
        Lit116 = (SimpleSymbol) new SimpleSymbol("ON4").readResolve();
        Lit115 = new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = new FString("com.google.appinventor.components.runtime.Label");
        Lit113 = (SimpleSymbol) new SimpleSymbol("Label5").readResolve();
        Lit112 = new FString("com.google.appinventor.components.runtime.Label");
        Lit111 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit110 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve();
        Lit109 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit108 = (SimpleSymbol) new SimpleSymbol("OFF3$Click").readResolve();
        Lit107 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 823378);
        Lit106 = new FString("com.google.appinventor.components.runtime.Button");
        Lit105 = (SimpleSymbol) new SimpleSymbol("OFF3").readResolve();
        Lit104 = new FString("com.google.appinventor.components.runtime.Button");
        Lit103 = (SimpleSymbol) new SimpleSymbol("ON3$Click").readResolve();
        Lit102 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 786514);
        Lit101 = new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = (SimpleSymbol) new SimpleSymbol("ON3").readResolve();
        Lit99 = new FString("com.google.appinventor.components.runtime.Button");
        Lit98 = new FString("com.google.appinventor.components.runtime.Label");
        Lit97 = (SimpleSymbol) new SimpleSymbol("Label4").readResolve();
        Lit96 = new FString("com.google.appinventor.components.runtime.Label");
        Lit95 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit94 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve();
        Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit92 = (SimpleSymbol) new SimpleSymbol("OFF2$Click").readResolve();
        Lit91 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 675922);
        Lit90 = new FString("com.google.appinventor.components.runtime.Button");
        Lit89 = (SimpleSymbol) new SimpleSymbol("OFF2").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.Button");
        Lit87 = (SimpleSymbol) new SimpleSymbol("ON2$Click").readResolve();
        Lit86 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 639058);
        Lit85 = new FString("com.google.appinventor.components.runtime.Button");
        Lit84 = (SimpleSymbol) new SimpleSymbol("ON2").readResolve();
        Lit83 = new FString("com.google.appinventor.components.runtime.Button");
        Lit82 = new FString("com.google.appinventor.components.runtime.Label");
        Lit81 = (SimpleSymbol) new SimpleSymbol("Label3").readResolve();
        Lit80 = new FString("com.google.appinventor.components.runtime.Label");
        Lit79 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit78 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit76 = (SimpleSymbol) new SimpleSymbol("OFF1$Click").readResolve();
        Lit75 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 528466);
        Lit74 = new FString("com.google.appinventor.components.runtime.Button");
        Lit73 = (SimpleSymbol) new SimpleSymbol("OFF1").readResolve();
        Lit72 = new FString("com.google.appinventor.components.runtime.Button");
        Lit71 = (SimpleSymbol) new SimpleSymbol("ON1$Click").readResolve();
        Lit70 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 491602);
        Lit69 = new FString("com.google.appinventor.components.runtime.Button");
        Lit68 = (SimpleSymbol) new SimpleSymbol("ON1").readResolve();
        Lit67 = new FString("com.google.appinventor.components.runtime.Button");
        Lit66 = new FString("com.google.appinventor.components.runtime.Label");
        Lit65 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.Label");
        Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit62 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit61 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit60 = (SimpleSymbol) new SimpleSymbol("OFF$Click").readResolve();
        Lit59 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 381010);
        Lit58 = new FString("com.google.appinventor.components.runtime.Button");
        Lit57 = (SimpleSymbol) new SimpleSymbol("OFF").readResolve();
        Lit56 = new FString("com.google.appinventor.components.runtime.Button");
        Lit55 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("ON$Click").readResolve();
        Lit53 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 344146);
        Lit52 = (SimpleSymbol) new SimpleSymbol("SendText").readResolve();
        Lit51 = new FString("com.google.appinventor.components.runtime.Button");
        Lit50 = (SimpleSymbol) new SimpleSymbol("ON").readResolve();
        Lit49 = new FString("com.google.appinventor.components.runtime.Button");
        Lit48 = new FString("com.google.appinventor.components.runtime.Label");
        Lit47 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit46 = new FString("com.google.appinventor.components.runtime.Label");
        Lit45 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit44 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit42 = new FString("com.google.appinventor.components.runtime.Label");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_RED;
        Lit41 = IntNum.make(iArr);
        Lit40 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit39 = (SimpleSymbol) new SimpleSymbol("hasilBluetooth").readResolve();
        Lit38 = new FString("com.google.appinventor.components.runtime.Label");
        Lit37 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("ListPicker1$AfterPicking").readResolve();
        Lit35 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1481198228597_0.9062858681663418-0/youngandroidproject/../src/appinventor/ai_B4U_Dynamite_Eurobeat/Lighttooth/Screen1.yail", 196728);
        Lit34 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("Connect").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("ListPicker1$BeforePicking").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit27 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit26 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit25 = (SimpleSymbol) new SimpleSymbol("ListPicker1").readResolve();
        Lit24 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit23 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit22 = IntNum.make(2);
        Lit21 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit20 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit19 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit18 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit17 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit16 = IntNum.make(-2);
        Lit15 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit13 = IntNum.make(3);
        Lit12 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit10 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit9 = (SimpleSymbol) new SimpleSymbol("BackPressed").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Screen1$BackPressed").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("Disconnect").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Screen1").readResolve();
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame = new frame();
        appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 1, Lit151, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 2, Lit152, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 3, Lit153, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 5, Lit154, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 6, Lit155, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 7, Lit156, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 8, Lit157, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 9, Lit158, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 10, Lit159, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 11, Lit160, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 13, Lit161, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 14, Lit162, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1791431272433290597.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 17, null, 0);
        this.Screen1$BackPressed = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 18, Lit8, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 24, null, 0);
        this.ListPicker1$BeforePicking = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 25, Lit31, 0);
        this.ListPicker1$AfterPicking = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 26, Lit36, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 27, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 28, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 29, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 34, null, 0);
        this.ON$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 35, Lit54, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 37, null, 0);
        this.OFF$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 38, Lit60, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 39, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 43, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 44, null, 0);
        this.ON1$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 45, Lit71, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 46, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 47, null, 0);
        this.OFF1$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 48, Lit76, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 49, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 50, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 51, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 52, null, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 53, null, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 54, null, 0);
        this.ON2$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 55, Lit87, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 56, null, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 57, null, 0);
        this.OFF2$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 58, Lit92, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 59, null, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 60, null, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 61, null, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 62, null, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 63, null, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 64, null, 0);
        this.ON3$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 65, Lit103, 0);
        lambda$Fn41 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 66, null, 0);
        lambda$Fn42 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 67, null, 0);
        this.OFF3$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 68, Lit108, 0);
        lambda$Fn43 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 69, null, 0);
        lambda$Fn44 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 70, null, 0);
        lambda$Fn45 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 71, null, 0);
        lambda$Fn46 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 72, null, 0);
        lambda$Fn47 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 73, null, 0);
        lambda$Fn48 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 74, null, 0);
        this.ON4$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 75, Lit119, 0);
        lambda$Fn49 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 76, null, 0);
        lambda$Fn50 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 77, null, 0);
        this.OFF4$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 78, Lit124, 0);
        lambda$Fn51 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 79, null, 0);
        lambda$Fn52 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 80, null, 0);
        lambda$Fn53 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 81, null, 0);
        lambda$Fn54 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 82, null, 0);
        lambda$Fn55 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 83, null, 0);
        lambda$Fn56 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 84, null, 0);
        this.ONA$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 85, Lit135, 0);
        lambda$Fn57 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 86, null, 0);
        lambda$Fn58 = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 87, null, 0);
        this.OFFA$Click = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 88, Lit140, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_B4U_Dynamite_Eurobeat_Lighttooth_Screen1_frame, 89, Lit147, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Lighttooth", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Smart House", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit8, this.Screen1$BackPressed);
                } else {
                    addToFormEnvironment(Lit8, this.Screen1$BackPressed);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "BackPressed");
                } else {
                    addToEvents(Lit0, Lit9);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit10, Lit11, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit18, Lit11, lambda$Fn4);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit19, Lit20, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit11, Lit23, Lit20, lambda$Fn6);
                }
                this.ListPicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit20, Lit24, Lit25, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit20, Lit27, Lit25, lambda$Fn8);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit31, this.ListPicker1$BeforePicking);
                } else {
                    addToFormEnvironment(Lit31, this.ListPicker1$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "BeforePicking");
                } else {
                    addToEvents(Lit25, Lit32);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit36, this.ListPicker1$AfterPicking);
                } else {
                    addToFormEnvironment(Lit36, this.ListPicker1$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "AfterPicking");
                } else {
                    addToEvents(Lit25, Lit37);
                }
                this.hasilBluetooth = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit20, Lit38, Lit39, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit20, Lit42, Lit39, lambda$Fn10);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit43, Lit44, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit11, Lit45, Lit44, lambda$Fn12);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit44, Lit46, Lit47, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit44, Lit48, Lit47, lambda$Fn14);
                }
                this.ON = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit44, Lit49, Lit50, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit44, Lit51, Lit50, lambda$Fn16);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit54, this.ON$Click);
                } else {
                    addToFormEnvironment(Lit54, this.ON$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ON", "Click");
                } else {
                    addToEvents(Lit50, Lit55);
                }
                this.OFF = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit44, Lit56, Lit57, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit44, Lit58, Lit57, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit60, this.OFF$Click);
                } else {
                    addToFormEnvironment(Lit60, this.OFF$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "OFF", "Click");
                } else {
                    addToEvents(Lit57, Lit55);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit61, Lit62, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit11, Lit63, Lit62, lambda$Fn20);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit64, Lit65, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit62, Lit66, Lit65, lambda$Fn22);
                }
                this.ON1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit67, Lit68, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit62, Lit69, Lit68, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit71, this.ON1$Click);
                } else {
                    addToFormEnvironment(Lit71, this.ON1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ON1", "Click");
                } else {
                    addToEvents(Lit68, Lit55);
                }
                this.OFF1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit72, Lit73, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit62, Lit74, Lit73, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit76, this.OFF1$Click);
                } else {
                    addToFormEnvironment(Lit76, this.OFF1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "OFF1", "Click");
                } else {
                    addToEvents(Lit73, Lit55);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit77, Lit78, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit11, Lit79, Lit78, lambda$Fn28);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit78, Lit80, Lit81, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit78, Lit82, Lit81, lambda$Fn30);
                }
                this.ON2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit78, Lit83, Lit84, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit78, Lit85, Lit84, lambda$Fn32);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit87, this.ON2$Click);
                } else {
                    addToFormEnvironment(Lit87, this.ON2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ON2", "Click");
                } else {
                    addToEvents(Lit84, Lit55);
                }
                this.OFF2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit78, Lit88, Lit89, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit78, Lit90, Lit89, lambda$Fn34);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit92, this.OFF2$Click);
                } else {
                    addToFormEnvironment(Lit92, this.OFF2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "OFF2", "Click");
                } else {
                    addToEvents(Lit89, Lit55);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit93, Lit94, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit11, Lit95, Lit94, lambda$Fn36);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit94, Lit96, Lit97, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit94, Lit98, Lit97, lambda$Fn38);
                }
                this.ON3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit94, Lit99, Lit100, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit94, Lit101, Lit100, lambda$Fn40);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit103, this.ON3$Click);
                } else {
                    addToFormEnvironment(Lit103, this.ON3$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ON3", "Click");
                } else {
                    addToEvents(Lit100, Lit55);
                }
                this.OFF3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit94, Lit104, Lit105, lambda$Fn41), $result);
                } else {
                    addToComponents(Lit94, Lit106, Lit105, lambda$Fn42);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit108, this.OFF3$Click);
                } else {
                    addToFormEnvironment(Lit108, this.OFF3$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "OFF3", "Click");
                } else {
                    addToEvents(Lit105, Lit55);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit109, Lit110, lambda$Fn43), $result);
                } else {
                    addToComponents(Lit11, Lit111, Lit110, lambda$Fn44);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit110, Lit112, Lit113, lambda$Fn45), $result);
                } else {
                    addToComponents(Lit110, Lit114, Lit113, lambda$Fn46);
                }
                this.ON4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit110, Lit115, Lit116, lambda$Fn47), $result);
                } else {
                    addToComponents(Lit110, Lit117, Lit116, lambda$Fn48);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit119, this.ON4$Click);
                } else {
                    addToFormEnvironment(Lit119, this.ON4$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ON4", "Click");
                } else {
                    addToEvents(Lit116, Lit55);
                }
                this.OFF4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit110, Lit120, Lit121, lambda$Fn49), $result);
                } else {
                    addToComponents(Lit110, Lit122, Lit121, lambda$Fn50);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit124, this.OFF4$Click);
                } else {
                    addToFormEnvironment(Lit124, this.OFF4$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "OFF4", "Click");
                } else {
                    addToEvents(Lit121, Lit55);
                }
                this.HorizontalArrangement7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit125, Lit126, lambda$Fn51), $result);
                } else {
                    addToComponents(Lit11, Lit127, Lit126, lambda$Fn52);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit126, Lit128, Lit129, lambda$Fn53), $result);
                } else {
                    addToComponents(Lit126, Lit130, Lit129, lambda$Fn54);
                }
                this.ONA = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit126, Lit131, Lit132, lambda$Fn55), $result);
                } else {
                    addToComponents(Lit126, Lit133, Lit132, lambda$Fn56);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit135, this.ONA$Click);
                } else {
                    addToFormEnvironment(Lit135, this.ONA$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ONA", "Click");
                } else {
                    addToEvents(Lit132, Lit55);
                }
                this.OFFA = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit126, Lit136, Lit137, lambda$Fn57), $result);
                } else {
                    addToComponents(Lit126, Lit138, Lit137, lambda$Fn58);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit140, this.OFFA$Click);
                } else {
                    addToFormEnvironment(Lit140, this.OFFA$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "OFFA", "Click");
                } else {
                    addToEvents(Lit137, Lit55);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit141, Lit142, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit143, Lit142, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit147, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit147, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit142, Lit148);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit149, Lit6, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit150, Lit6, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Lighttooth", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Smart House", Lit4);
    }

    public Object Screen1$BackPressed() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit6, Lit7, LList.Empty, LList.Empty);
        return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit15, Lit16, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit17, Lit16, Lit14);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit15, Lit16, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit17, Lit16, Lit14);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit17, Lit16, Lit14);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit17, Lit16, Lit14);
    }

    static Object lambda8() {
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit26, "Bluetooth Status", Lit4);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit26, "Bluetooth Status", Lit4);
    }

    public Object ListPicker1$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit28, runtime.getProperty$1(Lit6, Lit29), Lit30);
    }

    public Object ListPicker1$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit33, LList.list1(runtime.getProperty$1(Lit25, Lit34)), Lit35) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit25, Lit28, runtime.getProperty$1(Lit6, Lit29), Lit30) : Values.empty;
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit26, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit14);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit26, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit41, Lit14);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit17, Lit16, Lit14);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit17, Lit16, Lit14);
    }

    static Object lambda14() {
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit26, "Vacuum Cleaner : ", Lit4);
    }

    static Object lambda15() {
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit26, "Vacuum Cleaner : ", Lit4);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit26, "On", Lit4);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit26, "On", Lit4);
    }

    public Object ON$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("1"), Lit53);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit26, "Off", Lit4);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit26, "Off", Lit4);
    }

    public Object OFF$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("A"), Lit59);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit17, Lit16, Lit14);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit17, Lit16, Lit14);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit26, "TV :", Lit4);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit26, "TV :", Lit4);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit26, "On", Lit4);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit26, "On", Lit4);
    }

    public Object ON1$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("2"), Lit70);
    }

    static Object lambda26() {
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit26, "Off", Lit4);
    }

    static Object lambda27() {
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit26, "Off", Lit4);
    }

    public Object OFF1$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("B"), Lit75);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit17, Lit16, Lit14);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit17, Lit16, Lit14);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit26, "LED Light : ", Lit4);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit26, "LED Light : ", Lit4);
    }

    static Object lambda32() {
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit26, "On", Lit4);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit26, "On", Lit4);
    }

    public Object ON2$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("3"), Lit86);
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit26, "Off", Lit4);
    }

    static Object lambda35() {
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit26, "Off", Lit4);
    }

    public Object OFF2$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("C"), Lit91);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit17, Lit16, Lit14);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit17, Lit16, Lit14);
    }

    static Object lambda38() {
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit26, "AC :", Lit4);
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit26, "AC :", Lit4);
    }

    static Object lambda40() {
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit26, "On", Lit4);
    }

    static Object lambda41() {
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit26, "On", Lit4);
    }

    public Object ON3$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("4"), Lit102);
    }

    static Object lambda42() {
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit26, "Off", Lit4);
    }

    static Object lambda43() {
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit26, "Off", Lit4);
    }

    public Object OFF3$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("D"), Lit107);
    }

    static Object lambda44() {
        runtime.setAndCoerceProperty$Ex(Lit110, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit110, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit17, Lit16, Lit14);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit110, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit110, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit17, Lit16, Lit14);
    }

    static Object lambda46() {
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit26, "Washing Machine :", Lit4);
    }

    static Object lambda47() {
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit26, "Washing Machine :", Lit4);
    }

    static Object lambda48() {
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit26, "On", Lit4);
    }

    static Object lambda49() {
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit26, "On", Lit4);
    }

    public Object ON4$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("5"), Lit118);
    }

    static Object lambda50() {
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit26, "Off", Lit4);
    }

    static Object lambda51() {
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit26, "Off", Lit4);
    }

    public Object OFF4$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("E"), Lit123);
    }

    static Object lambda52() {
        runtime.setAndCoerceProperty$Ex(Lit126, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit17, Lit16, Lit14);
    }

    static Object lambda53() {
        runtime.setAndCoerceProperty$Ex(Lit126, Lit12, Lit13, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit126, Lit21, Lit22, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit17, Lit16, Lit14);
    }

    static Object lambda54() {
        return runtime.setAndCoerceProperty$Ex(Lit129, Lit26, "All :", Lit4);
    }

    static Object lambda55() {
        return runtime.setAndCoerceProperty$Ex(Lit129, Lit26, "All :", Lit4);
    }

    static Object lambda56() {
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit26, "On", Lit4);
    }

    static Object lambda57() {
        return runtime.setAndCoerceProperty$Ex(Lit132, Lit26, "On", Lit4);
    }

    public Object ONA$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("6"), Lit134);
    }

    static Object lambda58() {
        return runtime.setAndCoerceProperty$Ex(Lit137, Lit26, "Off", Lit4);
    }

    static Object lambda59() {
        return runtime.setAndCoerceProperty$Ex(Lit137, Lit26, "Off", Lit4);
    }

    public Object OFFA$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit6, Lit52, LList.list1("Z"), Lit139);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        if (runtime.getProperty$1(Lit6, Lit144) != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit39, Lit26, "Connected", Lit4);
            return runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit145, Lit14);
        }
        runtime.setAndCoerceProperty$Ex(Lit39, Lit26, "Not Connected", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit40, Lit146, Lit14);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
