SECTION = "devel/chicken"
DESCRIPTION = "Command-line argument handling, on top of SRFI 37"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://args.meta;md5=57587dfa1dc2bd564c021188efd9bdfc"
DEPENDS_append_class-cross = " chicken-egg-srfi-37-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-37-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-37 chicken-egg-srfi-37-crosssdk"
DEPENDS = " chicken-egg-srfi-37 chicken-egg-srfi-37-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-37"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/args/args-${PV}.tar.gz"

SRC_URI[md5sum] = "1f30bf40f1b0b6e4cff675e48811e0fd"
SRC_URI[sha256sum] = "62532d3479927a2c29d8f5540384c4698bdf747ddc843a4eb6ad9bbf1c627339"

S = "${WORKDIR}/args-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
