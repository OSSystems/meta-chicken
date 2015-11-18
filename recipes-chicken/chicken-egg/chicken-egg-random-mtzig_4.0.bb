SECTION = "devel/chicken"
DESCRIPTION = "An implementation of the MT19937 random number generator with Marsaglia and Tang's Ziggurat algorithm to generate random numbers from a non-uniform distribution."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://random-mtzig.meta;md5=b0ea67f8d5533a01473b23c2119793e9"
DEPENDS_append_class-cross = " chicken-egg-bind-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-bind-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bind chicken-egg-bind-crosssdk"
DEPENDS = " chicken-egg-bind chicken-egg-bind-cross"
RDEPENDS_${PN} = " chicken-egg-bind"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/random-mtzig/random-mtzig-${PV}.tar.gz"

SRC_URI[md5sum] = "f2f0b16b99bceb44fa30c9791c1e3e96"
SRC_URI[sha256sum] = "fde06b87830c930f7e8b1ea87676e160ea91ee3ed47a2fb523e9fe9fc80fe367"

S = "${WORKDIR}/random-mtzig-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
