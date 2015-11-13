SECTION = "devel/chicken"
DESCRIPTION = "SRFI 12 Condition Utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://condition-utils.meta;md5=373003b7aed90f4e744a02ae916992ad"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/condition-utils/condition-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "d04197f1dbf38a25aa2f31ff6d5cb1a6"
SRC_URI[sha256sum] = "bb3ee11d59f209cbc83e6869c4b4bba58ec4fca68cd69ff6c67f4770d5b94513"

S = "${WORKDIR}/condition-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
