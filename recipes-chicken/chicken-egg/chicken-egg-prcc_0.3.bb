SECTION = "devel/chicken"
DESCRIPTION = "Prcc is a PEG-like combinator parser library by packrat parsing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://prcc.meta;md5=111d0300aac5b198635e7a29039cdb84"
DEPENDS_append_class-cross = " chicken-egg-stack-cross chicken-egg-srfi-41-cross chicken-egg-record-variants-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-stack-crosssdk chicken-egg-srfi-41-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-stack nativesdk-chicken-egg-srfi-41 nativesdk-chicken-egg-record-variants chicken-egg-stack-crosssdk chicken-egg-srfi-41-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS = " chicken-egg-stack chicken-egg-srfi-41 chicken-egg-record-variants chicken-egg-stack-cross chicken-egg-srfi-41-cross chicken-egg-record-variants-cross"
RDEPENDS_${PN} = " chicken-egg-stack chicken-egg-srfi-41 chicken-egg-record-variants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/prcc/prcc-${PV}.tar.gz"

SRC_URI[md5sum] = "7ae2ecf76dca0b4527797233f0313888"
SRC_URI[sha256sum] = "44cc59257b1e4daade1e6f35b08a7b05ee196656f079e94e404eb4f068b09b12"

S = "${WORKDIR}/prcc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
