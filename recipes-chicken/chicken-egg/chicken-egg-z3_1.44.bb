SECTION = "devel/chicken"
DESCRIPTION = "A gzip (RFC1952) compression and decompression library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://z3.meta;md5=374335012e2fc5b6af51a600381940d3"
DEPENDS_append_class-cross = " chicken-egg-bind-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-bind-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bind chicken-egg-bind-crosssdk"
DEPENDS = " chicken-egg-bind chicken-egg-bind-cross"
RDEPENDS_${PN} = " chicken-egg-bind"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/z3/z3-${PV}.tar.gz"

SRC_URI[md5sum] = "ac9a7691bb4872a7f1fa6009c54f1c6f"
SRC_URI[sha256sum] = "2bba4ebf56d1b26f2e821345f04b49eaeed1e0977eab1c516bb0ae271e58929d"

S = "${WORKDIR}/z3-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
