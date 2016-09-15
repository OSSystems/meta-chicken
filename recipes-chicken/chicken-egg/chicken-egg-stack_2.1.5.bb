SECTION = "devel/chicken"
DESCRIPTION = "Provides LIFO queue (stack) operations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://stack.meta;md5=f3d7f7e868bab05129beda988676d5f6"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/stack/stack-${PV}.tar.gz"

SRC_URI[md5sum] = "6235e1d7331eb30ae578332e6d1f4336"
SRC_URI[sha256sum] = "e5c06837685b3411d38184c156f811ff26e7e0a96572d33fb298680975d7d0b1"

S = "${WORKDIR}/stack-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
