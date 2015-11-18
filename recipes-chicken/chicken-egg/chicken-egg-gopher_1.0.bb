SECTION = "devel/chicken"
DESCRIPTION = "Basic Gopher protocol interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gopher.meta;md5=2785b50e4b7115616943a24d3cd3a134"
DEPENDS_append_class-cross = " chicken-egg-sendfile-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sendfile-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sendfile chicken-egg-sendfile-crosssdk"
DEPENDS = " chicken-egg-sendfile chicken-egg-sendfile-cross"
RDEPENDS_${PN} = " chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gopher/gopher-${PV}.tar.gz"

SRC_URI[md5sum] = "63de1ac87388067e4b4fcee7bb1463cd"
SRC_URI[sha256sum] = "b363015ba56cd10245c518695f369d2061d7fa324bf4422fdb53981ba49510bf"

S = "${WORKDIR}/gopher-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
