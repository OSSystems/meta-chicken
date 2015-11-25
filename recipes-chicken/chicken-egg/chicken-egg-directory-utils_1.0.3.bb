SECTION = "devel/chicken"
DESCRIPTION = "directory-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://directory-utils.meta;md5=147a8849b3417d4f482fcf0e1e5ea80f"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-list-utils-cross chicken-egg-stack-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-list-utils-crosssdk chicken-egg-stack-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-list-utils nativesdk-chicken-egg-stack nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-list-utils-crosssdk chicken-egg-stack-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-list-utils chicken-egg-stack chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-list-utils-cross chicken-egg-stack-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-list-utils chicken-egg-stack chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/directory-utils/directory-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "709ae8c99220fe86cdf43376b3bdceca"
SRC_URI[sha256sum] = "a2082afc9536d6856b1790a9048b848f38ff867adb437fc23e2a391101a9613d"

S = "${WORKDIR}/directory-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
