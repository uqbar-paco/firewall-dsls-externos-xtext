/**
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.Accion;
import edu.tadp.firewall.firewalll.Condicion;
import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.Regla;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.ReglaImpl#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.ReglaImpl#getAccion <em>Accion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReglaImpl extends MinimalEObjectImpl.Container implements Regla
{
  /**
   * The cached value of the '{@link #getCondicion() <em>Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicion()
   * @generated
   * @ordered
   */
  protected Condicion condicion;

  /**
   * The cached value of the '{@link #getAccion() <em>Accion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccion()
   * @generated
   * @ordered
   */
  protected Accion accion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReglaImpl()
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
    return FirewalllPackage.Literals.REGLA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condicion getCondicion()
  {
    return condicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondicion(Condicion newCondicion, NotificationChain msgs)
  {
    Condicion oldCondicion = condicion;
    condicion = newCondicion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA__CONDICION, oldCondicion, newCondicion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondicion(Condicion newCondicion)
  {
    if (newCondicion != condicion)
    {
      NotificationChain msgs = null;
      if (condicion != null)
        msgs = ((InternalEObject)condicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.REGLA__CONDICION, null, msgs);
      if (newCondicion != null)
        msgs = ((InternalEObject)newCondicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.REGLA__CONDICION, null, msgs);
      msgs = basicSetCondicion(newCondicion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA__CONDICION, newCondicion, newCondicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accion getAccion()
  {
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccion(Accion newAccion, NotificationChain msgs)
  {
    Accion oldAccion = accion;
    accion = newAccion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA__ACCION, oldAccion, newAccion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccion(Accion newAccion)
  {
    if (newAccion != accion)
    {
      NotificationChain msgs = null;
      if (accion != null)
        msgs = ((InternalEObject)accion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.REGLA__ACCION, null, msgs);
      if (newAccion != null)
        msgs = ((InternalEObject)newAccion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.REGLA__ACCION, null, msgs);
      msgs = basicSetAccion(newAccion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA__ACCION, newAccion, newAccion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FirewalllPackage.REGLA__CONDICION:
        return basicSetCondicion(null, msgs);
      case FirewalllPackage.REGLA__ACCION:
        return basicSetAccion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FirewalllPackage.REGLA__CONDICION:
        return getCondicion();
      case FirewalllPackage.REGLA__ACCION:
        return getAccion();
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
      case FirewalllPackage.REGLA__CONDICION:
        setCondicion((Condicion)newValue);
        return;
      case FirewalllPackage.REGLA__ACCION:
        setAccion((Accion)newValue);
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
      case FirewalllPackage.REGLA__CONDICION:
        setCondicion((Condicion)null);
        return;
      case FirewalllPackage.REGLA__ACCION:
        setAccion((Accion)null);
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
      case FirewalllPackage.REGLA__CONDICION:
        return condicion != null;
      case FirewalllPackage.REGLA__ACCION:
        return accion != null;
    }
    return super.eIsSet(featureID);
  }

} //ReglaImpl
