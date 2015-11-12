SECTION = "devel/chicken"
DESCRIPTION = "Parametric 2L-systems"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://linden-scheme.meta;md5=fd155c4cf489d68cb478342fdc4f62d7"
DEPENDS_append_class-cross = " chicken-egg-gl-math-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-gl-math-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-gl-math chicken-egg-gl-math-crosssdk"
DEPENDS = " chicken-egg-gl-math chicken-egg-gl-math-cross"
RDEPENDS_${PN} = " chicken-egg-gl-math"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/linden-scheme/linden-scheme-${PV}.tar.gz"

SRC_URI[md5sum] = "5141f6a3fef12d6a1c0808874f095e5b"
SRC_URI[sha256sum] = "8755b8ac9d86f6e104db9b7e88341f60db6956e47c6fafb3ff712759140568eb"

S = "${WORKDIR}/linden-scheme-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
