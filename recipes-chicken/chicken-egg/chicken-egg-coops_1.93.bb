SECTION = "devel/chicken"
DESCRIPTION = "An featureful object system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://coops.meta;md5=042d38ad2b2fa2add8c0b5626fd8dbf7"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-record-variants-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-record-variants chicken-egg-matchable-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-record-variants chicken-egg-matchable-cross chicken-egg-record-variants-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-record-variants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/coops/coops-${PV}.tar.gz"

SRC_URI[md5sum] = "0bcca30a65e8bb258449b415c014f164"
SRC_URI[sha256sum] = "87b0190a9346e9ff7b932cf06e0cc2b5f297a8acae807d45a9e0dda992b65d9f"

S = "${WORKDIR}/coops-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
