SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the LMDB key value database"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lmdb.meta;md5=1b939bdb56743e2cb913a165d9285bdb"
DEPENDS_append_class-cross = " chicken-egg-rabbit-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-rabbit-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-rabbit chicken-egg-rabbit-crosssdk"
DEPENDS = " chicken-egg-rabbit chicken-egg-rabbit-cross"
RDEPENDS_${PN} = " chicken-egg-rabbit"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lmdb/lmdb-${PV}.tar.gz"

SRC_URI[md5sum] = "a8f80a2fc69d21907828ffe13aeb2f80"
SRC_URI[sha256sum] = "ff1ad537d3b95530d7dcff08575f49f67aaef196ed05cfe4e283aa395d713a6b"

S = "${WORKDIR}/lmdb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
