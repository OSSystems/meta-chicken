SECTION = "devel/chicken"
DESCRIPTION = "Automatically read and write s-expressions to a level implementation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://level-sexp.meta;md5=a4d57118e018660ae95578904e2498ec"
DEPENDS_append_class-cross = " chicken-egg-level-cross chicken-egg-interfaces-cross chicken-egg-lazy-seq-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-level-crosssdk chicken-egg-interfaces-crosssdk chicken-egg-lazy-seq-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-level nativesdk-chicken-egg-interfaces nativesdk-chicken-egg-lazy-seq chicken-egg-level-crosssdk chicken-egg-interfaces-crosssdk chicken-egg-lazy-seq-crosssdk"
DEPENDS = " chicken-egg-level chicken-egg-interfaces chicken-egg-lazy-seq chicken-egg-level-cross chicken-egg-interfaces-cross chicken-egg-lazy-seq-cross"
RDEPENDS_${PN} = " chicken-egg-level chicken-egg-interfaces chicken-egg-lazy-seq"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/level-sexp/level-sexp-${PV}.tar.gz"

SRC_URI[md5sum] = "1ba633fd9fa074a446ffe51cb73c3147"
SRC_URI[sha256sum] = "35d205b61d038ff3f0aa6bcb5e4e3823f4d40226ef41ab1880609f198e0a66c5"

S = "${WORKDIR}/level-sexp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
