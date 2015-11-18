SECTION = "devel/chicken"
DESCRIPTION = "The non-deterministic backtracking ambivalence operator"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://amb.meta;md5=3ffcb695cc8d92cd3ebda34fc35f31f1"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-amb-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/amb/amb-${PV}.tar.gz"

SRC_URI[md5sum] = "67416a9b29dd7404b2343d684f053f42"
SRC_URI[sha256sum] = "0312198695828b8897beb8d4d1b69628bd42a982faea9668f76423e5027efa25"

S = "${WORKDIR}/amb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
