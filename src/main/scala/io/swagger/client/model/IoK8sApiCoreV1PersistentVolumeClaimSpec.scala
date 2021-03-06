/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class IoK8sApiCoreV1PersistentVolumeClaimSpec (
  /* AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 */
  accessModes: Option[List[String]],
  /* Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources */
  resources: Option[IoK8sApiCoreV1ResourceRequirements],
  /* A label query over volumes to consider for binding. */
  selector: Option[IoK8sApimachineryPkgApisMetaV1LabelSelector],
  /* Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 */
  storageClassName: Option[String],
  /* VolumeName is the binding reference to the PersistentVolume backing this claim. */
  volumeName: Option[String]
)

