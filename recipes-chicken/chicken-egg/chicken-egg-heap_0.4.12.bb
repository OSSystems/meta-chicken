SECTION = "devel/chicken"
DESCRIPTION = "Mutable heap with priority-queue operations and O(1) membership-testing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://heap.meta;md5=0995d9856e7daa0fe1d7136259388e89"
DEPENDS_append_class-cross = " chicken-egg-define-record-and-printer-cross chicken-egg-hahn-cross chicken-egg-miscmacros-cross chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-define-record-and-printer-crosssdk chicken-egg-hahn-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-define-record-and-printer nativesdk-chicken-egg-hahn nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-vector-lib chicken-egg-define-record-and-printer-crosssdk chicken-egg-hahn-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-define-record-and-printer chicken-egg-hahn chicken-egg-miscmacros chicken-egg-vector-lib chicken-egg-define-record-and-printer-cross chicken-egg-hahn-cross chicken-egg-miscmacros-cross chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-define-record-and-printer chicken-egg-hahn chicken-egg-miscmacros chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/heap/heap-${PV}.tar.gz"

SRC_URI[md5sum] = "ae1d611dad8c09be74439ff50fd6df75"
SRC_URI[sha256sum] = "f892946ac2cea04c95c17fa3344bb4e0fefd9d6a82e320f03bf00698a1d85802"

S = "${WORKDIR}/heap-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
