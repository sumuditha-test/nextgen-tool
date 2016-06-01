/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outbound Endpoint Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OutboundEndpointDef#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OutboundEndpointDef#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOutboundEndpointDef()
 * @model
 * @generated
 */
public interface OutboundEndpointDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' attribute.
   * @see #setProtocol(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOutboundEndpointDef_Protocol()
   * @model
   * @generated
   */
  String getProtocol();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OutboundEndpointDef#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(String value);

  /**
   * Returns the value of the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host</em>' attribute.
   * @see #setHost(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOutboundEndpointDef_Host()
   * @model
   * @generated
   */
  String getHost();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OutboundEndpointDef#getHost <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host</em>' attribute.
   * @see #getHost()
   * @generated
   */
  void setHost(String value);

} // OutboundEndpointDef
