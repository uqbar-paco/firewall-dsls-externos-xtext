/**
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.IP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.IPImpl#getPrimero <em>Primero</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.IPImpl#getSegundo <em>Segundo</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.IPImpl#getTercero <em>Tercero</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.IPImpl#getCuarto <em>Cuarto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPImpl extends MinimalEObjectImpl.Container implements IP
{
  /**
   * The default value of the '{@link #getPrimero() <em>Primero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimero()
   * @generated
   * @ordered
   */
  protected static final int PRIMERO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrimero() <em>Primero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimero()
   * @generated
   * @ordered
   */
  protected int primero = PRIMERO_EDEFAULT;

  /**
   * The default value of the '{@link #getSegundo() <em>Segundo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegundo()
   * @generated
   * @ordered
   */
  protected static final int SEGUNDO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSegundo() <em>Segundo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegundo()
   * @generated
   * @ordered
   */
  protected int segundo = SEGUNDO_EDEFAULT;

  /**
   * The default value of the '{@link #getTercero() <em>Tercero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTercero()
   * @generated
   * @ordered
   */
  protected static final int TERCERO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTercero() <em>Tercero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTercero()
   * @generated
   * @ordered
   */
  protected int tercero = TERCERO_EDEFAULT;

  /**
   * The default value of the '{@link #getCuarto() <em>Cuarto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCuarto()
   * @generated
   * @ordered
   */
  protected static final int CUARTO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCuarto() <em>Cuarto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCuarto()
   * @generated
   * @ordered
   */
  protected int cuarto = CUARTO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IPImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FirewalllPackage.Literals.IP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrimero()
  {
    return primero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimero(int newPrimero)
  {
    int oldPrimero = primero;
    primero = newPrimero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.IP__PRIMERO, oldPrimero, primero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSegundo()
  {
    return segundo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSegundo(int newSegundo)
  {
    int oldSegundo = segundo;
    segundo = newSegundo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.IP__SEGUNDO, oldSegundo, segundo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTercero()
  {
    return tercero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTercero(int newTercero)
  {
    int oldTercero = tercero;
    tercero = newTercero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.IP__TERCERO, oldTercero, tercero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCuarto()
  {
    return cuarto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCuarto(int newCuarto)
  {
    int oldCuarto = cuarto;
    cuarto = newCuarto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.IP__CUARTO, oldCuarto, cuarto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FirewalllPackage.IP__PRIMERO:
        return getPrimero();
      case FirewalllPackage.IP__SEGUNDO:
        return getSegundo();
      case FirewalllPackage.IP__TERCERO:
        return getTercero();
      case FirewalllPackage.IP__CUARTO:
        return getCuarto();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FirewalllPackage.IP__PRIMERO:
        setPrimero((Integer)newValue);
        return;
      case FirewalllPackage.IP__SEGUNDO:
        setSegundo((Integer)newValue);
        return;
      case FirewalllPackage.IP__TERCERO:
        setTercero((Integer)newValue);
        return;
      case FirewalllPackage.IP__CUARTO:
        setCuarto((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FirewalllPackage.IP__PRIMERO:
        setPrimero(PRIMERO_EDEFAULT);
        return;
      case FirewalllPackage.IP__SEGUNDO:
        setSegundo(SEGUNDO_EDEFAULT);
        return;
      case FirewalllPackage.IP__TERCERO:
        setTercero(TERCERO_EDEFAULT);
        return;
      case FirewalllPackage.IP__CUARTO:
        setCuarto(CUARTO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FirewalllPackage.IP__PRIMERO:
        return primero != PRIMERO_EDEFAULT;
      case FirewalllPackage.IP__SEGUNDO:
        return segundo != SEGUNDO_EDEFAULT;
      case FirewalllPackage.IP__TERCERO:
        return tercero != TERCERO_EDEFAULT;
      case FirewalllPackage.IP__CUARTO:
        return cuarto != CUARTO_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (primero: ");
    result.append(primero);
    result.append(", segundo: ");
    result.append(segundo);
    result.append(", tercero: ");
    result.append(tercero);
    result.append(", cuarto: ");
    result.append(cuarto);
    result.append(')');
    return result.toString();
  }

} //IPImpl
