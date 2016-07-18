SECTION = "devel/chicken"
DESCRIPTION = "Tool for converting and maintaining a gnumeric spreadsheet as a set of flat text files."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://refdb.meta;md5=c93664b0d10edab56ebf1a10b09defa4"
DEPENDS_append_class-cross = " chicken-egg-ssax-cross chicken-egg-sxml-serializer-cross chicken-egg-sxml-modifications-cross chicken-egg-regex-cross chicken-egg-regex-case-cross chicken-egg-json-cross chicken-egg-csv-cross chicken-egg-sqlite3-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-ssax-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-sxml-modifications-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-case-crosssdk chicken-egg-json-crosssdk chicken-egg-csv-crosssdk chicken-egg-sqlite3-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxml-serializer nativesdk-chicken-egg-sxml-modifications nativesdk-chicken-egg-regex nativesdk-chicken-egg-regex-case nativesdk-chicken-egg-json nativesdk-chicken-egg-csv nativesdk-chicken-egg-sqlite3 chicken-egg-ssax-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-sxml-modifications-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-case-crosssdk chicken-egg-json-crosssdk chicken-egg-csv-crosssdk chicken-egg-sqlite3-crosssdk"
DEPENDS = " chicken-egg-ssax chicken-egg-sxml-serializer chicken-egg-sxml-modifications chicken-egg-regex chicken-egg-regex-case chicken-egg-json chicken-egg-csv chicken-egg-sqlite3 chicken-egg-ssax-cross chicken-egg-sxml-serializer-cross chicken-egg-sxml-modifications-cross chicken-egg-regex-cross chicken-egg-regex-case-cross chicken-egg-json-cross chicken-egg-csv-cross chicken-egg-sqlite3-cross chicken-egg-refdb-cross"
RDEPENDS_${PN} = " chicken-egg-ssax chicken-egg-sxml-serializer chicken-egg-sxml-modifications chicken-egg-regex chicken-egg-regex-case chicken-egg-json chicken-egg-csv chicken-egg-sqlite3"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/refdb/refdb-${PV}.tar.gz"

SRC_URI[md5sum] = "6ab1cccaac632b37fc121fdc5cb23042"
SRC_URI[sha256sum] = "e1e2f7b054bd1f7ec264eb8f0a2ae25c9d7c7a34781ca129e6631eb907fcbb8b"

S = "${WORKDIR}/refdb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
