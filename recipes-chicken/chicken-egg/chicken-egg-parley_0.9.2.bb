SECTION = "devel/chicken"
DESCRIPTION = "A readline replacement written in scheme based on linenoise."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://parley.meta;md5=deb2b485518dd6864744d502c009db40"
DEPENDS_append_class-cross = " chicken-egg-stty-cross chicken-egg-srfi-71-cross chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-stty-crosssdk chicken-egg-srfi-71-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-stty nativesdk-chicken-egg-srfi-71 nativesdk-chicken-egg-miscmacros chicken-egg-stty-crosssdk chicken-egg-srfi-71-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-stty chicken-egg-srfi-71 chicken-egg-miscmacros chicken-egg-stty-cross chicken-egg-srfi-71-cross chicken-egg-miscmacros-cross chicken-egg-parley-cross"
RDEPENDS_${PN} = " chicken-egg-stty chicken-egg-srfi-71 chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/parley/parley-${PV}.tar.gz"

SRC_URI[md5sum] = "819f6fc6866bd52406a77e2f4bfbef8c"
SRC_URI[sha256sum] = "fc5bf5bc105ea0e73eb54e535af06a23c020c4582c1b76b6cb490ae84b5d507c"

S = "${WORKDIR}/parley-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
