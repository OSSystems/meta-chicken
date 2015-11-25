SECTION = "devel/chicken"
DESCRIPTION = "Provides LIFO queue (stack) operations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://stack.meta;md5=38572395e01e25befb5290783f33e59c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/stack/stack-${PV}.tar.gz"

SRC_URI[md5sum] = "826ec6ec2867b56907f1fbf9b3c7189b"
SRC_URI[sha256sum] = "7b37264de8cb922a53be0e0086c9c8ff60cec6790685f9a4123220e7d4ee44c4"

S = "${WORKDIR}/stack-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
