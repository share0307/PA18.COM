package com.mcip.nia.orb;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "D:/Kevin/MCIPDOC/MCIPTEST/MCIPTEST/src/IDL/policyInfoStruct.idl"
 * <li> <b>IDL Name</b>      ::com::mcip::nia::orb::QuotaCndtn
 * <li> <b>Repository Id</b> IDL:com/mcip/nia/orb/QuotaCndtn:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * struct QuotaCndtn {
  ...
};
 * </pre>
 */
public final class QuotaCndtnHelper {
  private static boolean _inited = false;
  private static boolean _initing = false;
  private static org.omg.CORBA.TypeCode _type;
  private static boolean _initializing;

  private static org.omg.CORBA.ORB _orb () {
    return org.omg.CORBA.ORB.init();
  }

  public static com.mcip.nia.orb.QuotaCndtn read (final org.omg.CORBA.portable.InputStream _input) {
    final com.mcip.nia.orb.QuotaCndtn _result = new com.mcip.nia.orb.QuotaCndtn();
    _result.c_dpt_cde = _input.read_string();
    _result.c_insrnc_cde = _input.read_string();
    _result.c_rdr_cde = _input.read_string();
    _result.c_crgo_cls = _input.read_string();
    _result.c_crgo_cde = _input.read_string();
    _result.c_pack_cde = _input.read_string();
    _result.c_carriage_cde = _input.read_string();
    _result.c_frm_prt_ara = _input.read_string();
    _result.c_to_prt_ara = _input.read_string();
    _result.n_rate = _input.read_string();
    _result.c_nclm_desc = _input.read_wstring();
    return _result;
  }

  public static void write (final org.omg.CORBA.portable.OutputStream _output, final com.mcip.nia.orb.QuotaCndtn _vis_value) {
    _output.write_string((java.lang.String)_vis_value.c_dpt_cde);
    _output.write_string((java.lang.String)_vis_value.c_insrnc_cde);
    _output.write_string((java.lang.String)_vis_value.c_rdr_cde);
    _output.write_string((java.lang.String)_vis_value.c_crgo_cls);
    _output.write_string((java.lang.String)_vis_value.c_crgo_cde);
    _output.write_string((java.lang.String)_vis_value.c_pack_cde);
    _output.write_string((java.lang.String)_vis_value.c_carriage_cde);
    _output.write_string((java.lang.String)_vis_value.c_frm_prt_ara);
    _output.write_string((java.lang.String)_vis_value.c_to_prt_ara);
    _output.write_string((java.lang.String)_vis_value.n_rate);
    _output.write_wstring((java.lang.String)_vis_value.c_nclm_desc);
  }

  public static void insert (final org.omg.CORBA.Any any, final com.mcip.nia.orb.QuotaCndtn _vis_value) {
    any.insert_Streamable(new com.mcip.nia.orb.QuotaCndtnHolder(_vis_value));
  }

  public static com.mcip.nia.orb.QuotaCndtn extract (final org.omg.CORBA.Any any) {
    com.mcip.nia.orb.QuotaCndtn _vis_value;
    if (any instanceof com.inprise.vbroker.CORBA.Any) {
      com.mcip.nia.orb.QuotaCndtnHolder _vis_holder = new com.mcip.nia.orb.QuotaCndtnHolder();
      ((com.inprise.vbroker.CORBA.Any)any).extract_Streamable(_vis_holder);
      _vis_value = _vis_holder.value;
    }
    else {
      _vis_value = com.mcip.nia.orb.QuotaCndtnHelper.read(any.create_input_stream());
    }
    return _vis_value;
  }

  public static org.omg.CORBA.TypeCode type () {
    if (_type == null) {
      synchronized (org.omg.CORBA.TypeCode.class) {
        if (_type == null) {
          if (_initializing) {
            return _orb().create_recursive_tc(id());
          }
          _initializing = true;
          final org.omg.CORBA.StructMember[] members = new org.omg.CORBA.StructMember[11];
          members[0] = new org.omg.CORBA.StructMember("c_dpt_cde", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[1] = new org.omg.CORBA.StructMember("c_insrnc_cde", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[2] = new org.omg.CORBA.StructMember("c_rdr_cde", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[3] = new org.omg.CORBA.StructMember("c_crgo_cls", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[4] = new org.omg.CORBA.StructMember("c_crgo_cde", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[5] = new org.omg.CORBA.StructMember("c_pack_cde", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[6] = new org.omg.CORBA.StructMember("c_carriage_cde", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[7] = new org.omg.CORBA.StructMember("c_frm_prt_ara", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[8] = new org.omg.CORBA.StructMember("c_to_prt_ara", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[9] = new org.omg.CORBA.StructMember("n_rate", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_string), null);
          members[10] = new org.omg.CORBA.StructMember("c_nclm_desc", _orb().get_primitive_tc(org.omg.CORBA.TCKind.tk_wstring), null);
          _type = _orb().create_struct_tc(id(), "QuotaCndtn", members);
          _initializing = false;
        }
      }
    }
    return _type;
  }

  public static java.lang.String id () {
    return "IDL:com/mcip/nia/orb/QuotaCndtn:1.0";
  }
}
