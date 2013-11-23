package edu.tadp.firewall.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import edu.tadp.firewall.firewalll.Accion;
import edu.tadp.firewall.firewalll.AceptarAccion;
import edu.tadp.firewall.firewalll.BloquearAccion;
import edu.tadp.firewall.firewalll.Condicion;
import edu.tadp.firewall.firewalll.CondicionIP;
import edu.tadp.firewall.firewalll.CondicionPuerto;
import edu.tadp.firewall.firewalll.ForwardearAccion;
import edu.tadp.firewall.firewalll.IP;
import edu.tadp.firewall.firewalll.Regla;
import edu.tadp.firewall.firewalll.ReglaEtiquetada;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class FirewalllGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<String> fileParts = this.fileParts(resource);
    String className = this.className(fileParts);
    String packageName = this.packageName(fileParts);
    String _join = IterableExtensions.join(fileParts, "/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ar.edu.tadp.firewall.*;");
    _builder.newLine();
    _builder.append("import ar.edu.tadp.firewall.implementations.BasicHandler;");
    _builder.newLine();
    _builder.append("import ar.edu.tadp.firewall.conditions.*;");
    _builder.newLine();
    _builder.append("import ar.edu.tadp.firewall.rules.*;");
    _builder.newLine();
    _builder.append("import ar.edu.tadp.rules.*;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends Firewall {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "	");
    _builder.append("(String lan) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("BasicHandler basicHandler = new BasicHandler();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ExclusiveRuleChain<Request> chain = new ExclusiveRuleChain<Request>();");
    _builder.newLine();
    {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<ReglaEtiquetada> _filter = Iterables.<ReglaEtiquetada>filter(_iterable, ReglaEtiquetada.class);
      for(final ReglaEtiquetada r : _filter) {
        _builder.append("\t\t");
        CharSequence _compile = this.compile(r);
        _builder.append(_compile, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("this.addRule(chain);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    fsa.generateFile(_join, _builder);
  }
  
  public Iterable<String> fileParts(final Resource resource) {
    URI _uRI = resource.getURI();
    List<String> _segmentsList = _uRI.segmentsList();
    List<String> _list = IterableExtensions.<String>toList(_segmentsList);
    ArrayList<String> _arrayList = new ArrayList<String>(_list);
    ArrayList<String> segments = _arrayList;
    int _size = segments.size();
    int _minus = (_size - 1);
    String last = segments.remove(_minus);
    String _replace = last.replace(".firewall", ".java");
    segments.add(_replace);
    return IterableExtensions.<String>drop(segments, 3);
  }
  
  public String className(final Iterable<String> fileParts) {
    String _last = IterableExtensions.<String>last(fileParts);
    String _replace = _last.replace(".java", "");
    return _replace;
  }
  
  public String packageName(final Iterable<String> fileParts) {
    int _size = IterableExtensions.size(fileParts);
    int _minus = (_size - 1);
    Iterable<String> _take = IterableExtensions.<String>take(fileParts, _minus);
    String _join = IterableExtensions.join(_take, ".");
    return _join;
  }
  
  protected CharSequence _compile(final ReglaEtiquetada rule) {
    CharSequence _xifexpression = null;
    String _lan = rule.getLan();
    boolean _notEquals = (!Objects.equal(_lan, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if(lan.equals(\"");
      String _lan_1 = rule.getLan();
      _builder.append(_lan_1, "");
      _builder.append("\")) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("chain.add(");
      Regla _regla = rule.getRegla();
      CharSequence _compile = this.compile(_regla);
      _builder.append(_compile, "	");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("chain.add(");
      Regla _regla_1 = rule.getRegla();
      CharSequence _compile_1 = this.compile(_regla_1);
      _builder_1.append(_compile_1, "");
      _builder_1.append(");");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _compile(final Regla rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new BasicRule<Request>(");
    Condicion _condicion = rule.getCondicion();
    CharSequence _compile = this.compile(_condicion);
    _builder.append(_compile, "");
    _builder.append(",");
    Accion _accion = rule.getAccion();
    CharSequence _compile_1 = this.compile(_accion);
    _builder.append(_compile_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final AceptarAccion accion) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new AceptarAction(basicHandler)");
    return _builder;
  }
  
  protected CharSequence _compile(final BloquearAccion accion) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new BloquearAction(basicHandler)");
    return _builder;
  }
  
  protected CharSequence _compile(final ForwardearAccion accion) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ForwardAction(new Address(\"");
    IP _ip = accion.getIp();
    CharSequence _format = this.format(_ip);
    _builder.append(_format, "");
    _builder.append("\", ");
    int _puerto = accion.getPuerto();
    _builder.append(_puerto, "");
    _builder.append("), basicHandler)");
    return _builder;
  }
  
  protected CharSequence _compile(final CondicionIP condicion) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new IPCondition(\"");
    IP _ip = condicion.getIp();
    CharSequence _format = this.format(_ip);
    _builder.append(_format, "");
    _builder.append("\", AddressType.SOURCE)");
    return _builder;
  }
  
  protected CharSequence _compile(final CondicionPuerto condicion) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new PortCondition(");
    int _puerto = condicion.getPuerto();
    _builder.append(_puerto, "");
    _builder.append(", AddressType.DESTINATION)");
    return _builder;
  }
  
  public CharSequence format(final IP ip) {
    StringConcatenation _builder = new StringConcatenation();
    int _primero = ip.getPrimero();
    _builder.append(_primero, "");
    _builder.append(".");
    int _segundo = ip.getSegundo();
    _builder.append(_segundo, "");
    _builder.append(".");
    int _tercero = ip.getTercero();
    _builder.append(_tercero, "");
    _builder.append(".");
    int _cuarto = ip.getCuarto();
    _builder.append(_cuarto, "");
    return _builder;
  }
  
  public CharSequence compile(final EObject accion) {
    if (accion instanceof AceptarAccion) {
      return _compile((AceptarAccion)accion);
    } else if (accion instanceof BloquearAccion) {
      return _compile((BloquearAccion)accion);
    } else if (accion instanceof CondicionIP) {
      return _compile((CondicionIP)accion);
    } else if (accion instanceof CondicionPuerto) {
      return _compile((CondicionPuerto)accion);
    } else if (accion instanceof ForwardearAccion) {
      return _compile((ForwardearAccion)accion);
    } else if (accion instanceof Regla) {
      return _compile((Regla)accion);
    } else if (accion instanceof ReglaEtiquetada) {
      return _compile((ReglaEtiquetada)accion);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(accion).toString());
    }
  }
}
