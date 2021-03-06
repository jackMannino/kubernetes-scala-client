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


case class IoK8sApiCoreV1PersistentVolumeSpec (
  /* AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes */
  accessModes: Option[List[String]],
  /* AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore */
  awsElasticBlockStore: Option[IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource],
  /* AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
  azureDisk: Option[IoK8sApiCoreV1AzureDiskVolumeSource],
  /* AzureFile represents an Azure File Service mount on the host and bind mount to the pod. */
  azureFile: Option[IoK8sApiCoreV1AzureFilePersistentVolumeSource],
  /* A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  capacity: Option[Map[String, IoK8sApimachineryPkgApiResourceQuantity]],
  /* CephFS represents a Ceph FS mount on the host that shares a pod's lifetime */
  cephfs: Option[IoK8sApiCoreV1CephFSPersistentVolumeSource],
  /* Cinder represents a cinder volume attached and mounted on kubelets host machine More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md */
  cinder: Option[IoK8sApiCoreV1CinderVolumeSource],
  /* ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding */
  claimRef: Option[IoK8sApiCoreV1ObjectReference],
  /* FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod. */
  fc: Option[IoK8sApiCoreV1FCVolumeSource],
  /* FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. This is an alpha feature and may change in future. */
  flexVolume: Option[IoK8sApiCoreV1FlexVolumeSource],
  /* Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running */
  flocker: Option[IoK8sApiCoreV1FlockerVolumeSource],
  /* GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk */
  gcePersistentDisk: Option[IoK8sApiCoreV1GCEPersistentDiskVolumeSource],
  /* Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md */
  glusterfs: Option[IoK8sApiCoreV1GlusterfsVolumeSource],
  /* HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath */
  hostPath: Option[IoK8sApiCoreV1HostPathVolumeSource],
  /* ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. */
  iscsi: Option[IoK8sApiCoreV1ISCSIVolumeSource],
  /* Local represents directly-attached storage with node affinity */
  local: Option[IoK8sApiCoreV1LocalVolumeSource],
  /* A list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options */
  mountOptions: Option[List[String]],
  /* NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs */
  nfs: Option[IoK8sApiCoreV1NFSVolumeSource],
  /* What happens to a persistent volume when released from its claim. Valid options are Retain (default) and Recycle. Recycling must be supported by the volume plugin underlying this persistent volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming */
  persistentVolumeReclaimPolicy: Option[String],
  /* PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine */
  photonPersistentDisk: Option[IoK8sApiCoreV1PhotonPersistentDiskVolumeSource],
  /* PortworxVolume represents a portworx volume attached and mounted on kubelets host machine */
  portworxVolume: Option[IoK8sApiCoreV1PortworxVolumeSource],
  /* Quobyte represents a Quobyte mount on the host that shares a pod's lifetime */
  quobyte: Option[IoK8sApiCoreV1QuobyteVolumeSource],
  /* RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md */
  rbd: Option[IoK8sApiCoreV1RBDVolumeSource],
  /* ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes. */
  scaleIO: Option[IoK8sApiCoreV1ScaleIOVolumeSource],
  /* Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass. */
  storageClassName: Option[String],
  /* StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://releases.k8s.io/HEAD/examples/volumes/storageos/README.md */
  storageos: Option[IoK8sApiCoreV1StorageOSPersistentVolumeSource],
  /* VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
  vsphereVolume: Option[IoK8sApiCoreV1VsphereVirtualDiskVolumeSource]
)

