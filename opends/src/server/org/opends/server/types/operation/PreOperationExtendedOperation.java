/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE
 * or https://OpenDS.dev.java.net/OpenDS.LICENSE.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE.  If applicable,
 * add the following below this CDDL HEADER, with the fields enclosed
 * by brackets "[]" replaced with your own identifying information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Portions Copyright 2006-2007 Sun Microsystems, Inc.
 */
package org.opends.server.types.operation;



import org.opends.server.protocols.asn1.ASN1OctetString;



/**
 * This class defines a set of methods that are available for use by
 * pre-operation plugins for extended operations.  Note that this
 * interface is intended only to define an API for use by plugins and
 * is not intended to be implemented by any custom classes.
 */
@org.opends.server.types.PublicAPI(
     stability=org.opends.server.types.StabilityLevel.UNCOMMITTED,
     mayInstantiate=false,
     mayExtend=false,
     mayInvoke=true)
public interface PreOperationExtendedOperation
       extends PreOperationOperation
{
  /**
   * Retrieves the OID for the request associated with this extended
   * operation.
   *
   * @return  The OID for the request associated with this extended
   *          operation.
   */
  public String getRequestOID();



  /**
   * Retrieves the value for the request associated with this extended
   * operation.
   *
   * @return  The value for the request associated with this extended
   *          operation.
   */
  public ASN1OctetString getRequestValue();



  /**
   * Specifies the OID to include in the response to the client.
   *
   * @param  responseOID  The OID to include in the response to the
   *                      client.
   */
  public void setResponseOID(String responseOID);



  /**
   * Specifies the value to include in the response to the client.
   *
   * @param  responseValue  The value to include in the response to
   *                        the client.
   */
  public void setResponseValue(ASN1OctetString responseValue);
}

