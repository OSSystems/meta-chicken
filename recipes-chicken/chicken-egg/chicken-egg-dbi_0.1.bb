SECTION = "devel/chicken"
DESCRIPTION = "An abstract database interface."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dbi.meta;md5=4c37a41b0f58a5429c14dfb9a59e7b47"
DEPENDS_append_class-cross = " chicken-egg-autoload-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-autoload-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-autoload chicken-egg-autoload-crosssdk"
DEPENDS = " chicken-egg-autoload chicken-egg-autoload-cross"
RDEPENDS_${PN} = " chicken-egg-autoload"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbi/dbi-${PV}.tar.gz"

SRC_URI[md5sum] = "005a33052927f0d823414fa1f29c12e5"
SRC_URI[sha256sum] = "d7613832c8075fdc3f7ddb8e1c9956573e598fcae2b8bde6452ca45f22634484"

S = "${WORKDIR}/dbi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
