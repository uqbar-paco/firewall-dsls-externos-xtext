/**
 */
package edu.tadp.firewall.firewalll.util;

import edu.tadp.firewall.firewalll.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.tadp.firewall.firewalll.FirewalllPackage
 * @generated
 */
public class FirewalllAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FirewalllPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirewalllAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FirewalllPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FirewalllSwitch<Adapter> modelSwitch =
    new FirewalllSwitch<Adapter>()
    {
      @Override
      public Adapter caseFirewall(Firewall object)
      {
        return createFirewallAdapter();
      }
      @Override
      public Adapter caseRegla(Regla object)
      {
        return createReglaAdapter();
      }
      @Override
      public Adapter caseCondicion(Condicion object)
      {
        return createCondicionAdapter();
      }
      @Override
      public Adapter caseCondicionPuerto(CondicionPuerto object)
      {
        return createCondicionPuertoAdapter();
      }
      @Override
      public Adapter caseCondicionIP(CondicionIP object)
      {
        return createCondicionIPAdapter();
      }
      @Override
      public Adapter caseIP(IP object)
      {
        return createIPAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.tadp.firewall.firewalll.Firewall <em>Firewall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.tadp.firewall.firewalll.Firewall
   * @generated
   */
  public Adapter createFirewallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.tadp.firewall.firewalll.Regla <em>Regla</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.tadp.firewall.firewalll.Regla
   * @generated
   */
  public Adapter createReglaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.tadp.firewall.firewalll.Condicion <em>Condicion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.tadp.firewall.firewalll.Condicion
   * @generated
   */
  public Adapter createCondicionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.tadp.firewall.firewalll.CondicionPuerto <em>Condicion Puerto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.tadp.firewall.firewalll.CondicionPuerto
   * @generated
   */
  public Adapter createCondicionPuertoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.tadp.firewall.firewalll.CondicionIP <em>Condicion IP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.tadp.firewall.firewalll.CondicionIP
   * @generated
   */
  public Adapter createCondicionIPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.tadp.firewall.firewalll.IP <em>IP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.tadp.firewall.firewalll.IP
   * @generated
   */
  public Adapter createIPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FirewalllAdapterFactory
