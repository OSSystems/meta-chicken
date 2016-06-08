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

SRC_URI[md5sum] = "9540cb48fc1ab9033c13b56c669841d5"
SRC_URI[sha256sum] = "b202fdc7bbfde4452cae3c7b2f35060a516d214af22279cfb1e003bff4ed9719"

S = "${WORKDIR}/linden-scheme-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
