SECTION = "devel/chicken"
DESCRIPTION = "Bloom Filter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bloom-filter.meta;md5=1a29fd574d888ccde2a4fc8a3da5442b"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-iset-cross chicken-egg-message-digest-cross chicken-egg-hashes-cross chicken-egg-check-errors-cross chicken-egg-record-variants-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-iset-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-hashes-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-iset nativesdk-chicken-egg-message-digest nativesdk-chicken-egg-hashes nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-record-variants chicken-egg-setup-helper-crosssdk chicken-egg-iset-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-hashes-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-iset chicken-egg-message-digest chicken-egg-hashes chicken-egg-check-errors chicken-egg-record-variants chicken-egg-setup-helper-cross chicken-egg-iset-cross chicken-egg-message-digest-cross chicken-egg-hashes-cross chicken-egg-check-errors-cross chicken-egg-record-variants-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-iset chicken-egg-message-digest chicken-egg-hashes chicken-egg-check-errors chicken-egg-record-variants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bloom-filter/bloom-filter-${PV}.tar.gz"

SRC_URI[md5sum] = "5321d0a689de1baec425d87a83312b7d"
SRC_URI[sha256sum] = "6f4e95821dda1a87c7a391717b4c7fd82dd2dedb2e45ea157e29c5ad63fb8225"

S = "${WORKDIR}/bloom-filter-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
