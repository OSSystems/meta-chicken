SECTION = "devel/chicken"
DESCRIPTION = "Tool for converting and maintaining a gnumeric spreadsheet as a set of flat text files."
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://refdb.meta;md5=adac611975e18d30ece695f3dafc4b69"
DEPENDS_append_class-cross = " chicken-egg-ssax-cross chicken-egg-sxml-serializer-cross chicken-egg-sxml-modifications-cross chicken-egg-regex-cross chicken-egg-regex-case-cross chicken-egg-json-cross chicken-egg-csv-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-ssax-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-sxml-modifications-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-case-crosssdk chicken-egg-json-crosssdk chicken-egg-csv-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxml-serializer nativesdk-chicken-egg-sxml-modifications nativesdk-chicken-egg-regex nativesdk-chicken-egg-regex-case nativesdk-chicken-egg-json nativesdk-chicken-egg-csv chicken-egg-ssax-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-sxml-modifications-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-case-crosssdk chicken-egg-json-crosssdk chicken-egg-csv-crosssdk"
DEPENDS = " chicken-egg-ssax chicken-egg-sxml-serializer chicken-egg-sxml-modifications chicken-egg-regex chicken-egg-regex-case chicken-egg-json chicken-egg-csv chicken-egg-ssax-cross chicken-egg-sxml-serializer-cross chicken-egg-sxml-modifications-cross chicken-egg-regex-cross chicken-egg-regex-case-cross chicken-egg-json-cross chicken-egg-csv-cross"
RDEPENDS_${PN} = " chicken-egg-ssax chicken-egg-sxml-serializer chicken-egg-sxml-modifications chicken-egg-regex chicken-egg-regex-case chicken-egg-json chicken-egg-csv"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/refdb/refdb-${PV}.tar.gz"

SRC_URI[md5sum] = "1967495fdb08f12bb52db8c1e0ef66b1"
SRC_URI[sha256sum] = "173a2cff0ec86fe9e88f3977a418a9d107e1c7685350b050944e17e53427c2e0"

S = "${WORKDIR}/refdb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
